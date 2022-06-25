/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Cliente;
import Modelo.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "ControlCliente", urlPatterns = {"/ControlCliente"})
public class ControlCliente extends HttpServlet {

    String listar="/Hj_RegistroCliente.jsp";
    String add="index.jsp";
    String edit="/Ed_Cliente.jsp";
    
    Cliente cli = new Cliente();
    ClienteDAO dao = new ClienteDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControlCliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControlCliente at " + request.getContextPath() + "</h1>");
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
                    int dni = Integer.parseInt(request.getParameter("txtDni"));
                    String nom = request.getParameter("txtNombre");
                    String ape_pa = request.getParameter("txtApellido_pa");
                    String ape_ma = request.getParameter("txtApellido_ma");
                    String dis = request.getParameter("txtDistrito");
                    String dire = request.getParameter("txtDireccion");
                    int tel = Integer.parseInt(request.getParameter("txtTelefono"));
                    String cor = request.getParameter("txtCorreo");
                    cli.setDNI(dni);
                    cli.setNombre(nom);
                    cli.setAp_paterno(ape_pa);
                    cli.setAp_materno(ape_ma);
                    cli.setDistrito(dis);
                    cli.setDireccion(dire);
                    cli.setTelefono(tel);
                    cli.setCorreo_electronico(cor);

                    
                    dao.add(cli);
                    acceso=listar;
                }
        else if (action.equalsIgnoreCase("editar")) 
        {
            request.setAttribute("idper",request.getParameter("id"));
            acceso=edit; 
        }
        else if (action.equalsIgnoreCase("actualizar")) 
        {
            
                    int dni = Integer.parseInt(request.getParameter("txtDni"));
                    String nom = request.getParameter("txtNombre");
                    String ape = request.getParameter("txtApellidos");
                    int tel = Integer.parseInt(request.getParameter("txtTelefono"));
                    String cor = request.getParameter("txtCorreo");
                    cli.setDNI(dni);
                    cli.setNombre(nom);
                    cli.setAp_paterno(ape);
                    cli.setTelefono(tel);
                    cli.setCorreo_electronico(cor);
    
                    
                    dao.add( cli);
            acceso=listar;
        }
        else if (action.equalsIgnoreCase("eliminar"))
        {
            int dni=Integer.parseInt(request.getParameter("dni"));
            cli.setDNI(dni);
            
            dao.eliminar(dni);
            
             acceso=listar;
        }
        javax.servlet.RequestDispatcher vista=(javax.servlet.RequestDispatcher) request.getRequestDispatcher(acceso);
        vista.forward(request, response);
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
