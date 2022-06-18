/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Entidad.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "ServletUsuario", urlPatterns = {"/ServletUsuario"})
public class ServletUsuario extends HttpServlet {
    String listar="/Hj_RegistroUsuario.jsp";
    String add="index.jsp";
    String edit="/Ed_Usuario.jsp";
      UsuarioDAO dao = new  UsuarioDAO();
    Usuario usu = new Usuario();
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
String acceso="";
        String action=request.getParameter("accion");
      
        if (action.equalsIgnoreCase("listar"))
        {
          
            acceso=listar;
        }else if(action.equalsIgnoreCase("agregar"))
                {
                    int id_usuario = Integer.parseInt(request.getParameter("txtid_usuario"));
                    int rol = Integer.parseInt(request.getParameter("txtid_rol"));
                    int dni_ref = Integer.parseInt(request.getParameter("txtdni"));
                    String nombre_usuario = request.getParameter("txtnombre_usuario");
                    String contraseña = request.getParameter("txtcontraseña");
        
                    usu.setId_usuario(id_usuario);
                    usu.setRol(rol);
                    usu.setDni_ref(dni_ref);
                    usu.setNombre_usuario(nombre_usuario);
                    usu.setContraseña(contraseña);
              

                    dao.add(usu);
                    acceso=listar;
                }
        else if (action.equalsIgnoreCase("editar")) 
        {
            request.setAttribute("idper",request.getParameter("id"));
            acceso=edit; 
        }
        else if (action.equalsIgnoreCase("actualizar")) 
        {
            
                    int id_usuario = Integer.parseInt(request.getParameter("txtid_usuario"));
                    int rol = Integer.parseInt(request.getParameter("txtid_rol"));
                    String nombre_usuario = request.getParameter("txtnombre_usuario");
                    String contraseña = request.getParameter("txtcontraseña");
        
                    usu.setId_usuario(id_usuario);
                    usu.setRol(rol);
                    usu.setNombre_usuario(nombre_usuario);
                    usu.setContraseña(contraseña);
              
    
                    dao.edit(usu);
            acceso=listar;
        }
        else if (action.equalsIgnoreCase("eliminar"))
        {
            int id =Integer.parseInt(request.getParameter("dni"));
            usu.setId_usuario(id);
            
            dao.eliminar(id);
            
             acceso=listar;
        }
        javax.servlet.RequestDispatcher vista=(javax.servlet.RequestDispatcher) request.getRequestDispatcher(acceso);
        vista.forward(request, response);


//processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
