 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Usuario;
import Modelo.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "validar_1", urlPatterns = {"/validar_1"})
public class Validar_1 extends HttpServlet {
    

    UsuarioDAO dao = new UsuarioDAO();
    Usuario us = new Usuario();
    int r;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("Ingresar")){
           /*    String contraseña, nombre_usuario;
                    int id_usuario, rol, dni_ref;
                    boolean estado_usuario;*/ 
            String nombre_usuario = request.getParameter("txtuser");
            String contraseña = request.getParameter("txtpass");
            us.setNombre_usuario(nombre_usuario);
            us.setContraseña(contraseña);
            r= dao.validar(us);
            if (r==1) {
                
                request.getSession().setAttribute("nombre_usuario",nombre_usuario);
                request.getSession().setAttribute("contraseña",contraseña);
                request.getRequestDispatcher("Ad_Tecnico.jsp").forward(request, response);
                
            } else {
                  request.getRequestDispatcher("login_1.jsp").forward(request, response);
            }
        }       
        else if (action.equalsIgnoreCase("listar"))
        {
             request.getRequestDispatcher("login_1.jsp").forward(request, response);
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
    

        processRequest(request, response); 
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
            /*  String accion=request.getParameter("accion");
        if(accion.equalsIgnoreCase("Ingresar"))
        {
      
            String user=request.getParameter("txtuser");
            int pass=Integer.parseInt(request.getParameter("txtpass"));
            
            us=dao.validar(user, pass);
            if(us.getNombre_usuario()!=null && us.getRol() == 1){
                request.getSession().setAttribute("persona", us);
                
                request.getRequestDispatcher("controlador?menu=Cliente&accion=Listar").forward(request, response);
            }else if(us.getNombre_usuario()!=null && us.getRol() == 2){
                request.getSession().setAttribute("persona", us);
                
                 request.getRequestDispatcher("controlador?menu=Tecnico&accion=Listar").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
                
                     /* tipo_persona tip = new tipo_persona();
            String user=request.getParameter("txtuser");
            int pass=Integer.parseInt(request.getParameter("txtpass"));
            per.setCorreo_electronico(user);
            per.setDNI(pass);
            r=dao.login(per, tip);
            if(r==1){
                request.getSession().setAttribute("persona", per);
                request.getRequestDispatcher("ServletTecnico?accion=listar").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
              
            }
        }*/
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
