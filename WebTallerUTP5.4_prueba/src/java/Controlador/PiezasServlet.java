/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Cliente;
import Entidad.Pieza;
import Modelo.PiezaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "PiezasServlet", urlPatterns = {"/PiezasServlet"})
public class PiezasServlet extends HttpServlet {

String listar="/Ad_Piezas.jsp";
String add="index.jsp";
String edit="/Ed_Pieza.jsp";

PiezaDAO dao =new PiezaDAO();
Pieza pi  =new Pieza();

Cliente cli  = new Cliente();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PiezasServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PiezasServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
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
                    int id_pieza = Integer.parseInt(request.getParameter("txtid_pieza"));
                    String nombre_pieza = request.getParameter("txtnombre_pieza");
                    String descripcion_pieza = request.getParameter("txtdes_pieza");
      
            
                    
                    pi.setId_pieza(id_pieza);
                    pi.setNombre_pieza(nombre_pieza);
                    pi.setDescripcion(descripcion_pieza);
         
                    dao.add(pi);
                    acceso=listar;
                }
        else if (action.equalsIgnoreCase("editar")) 
        {
            request.setAttribute("id_pieza",request.getParameter("id"));
            acceso=edit; 
        }
        else if (action.equalsIgnoreCase("Actualizar")) 
        {
                    int id_pieza = Integer.parseInt(request.getParameter("txtid_pieza"));
                    String nom_pieza = request.getParameter("txtnombre_pieza");
                    String des_pieza = request.getParameter("txtdes_pieza");
            
                    
                    pi.setId_pieza(id_pieza);
                    pi.setNombre_pieza(nom_pieza);
                    pi.setDescripcion(des_pieza);
                    
                    dao.edit(pi);
                    acceso=listar;
        }
        else if (action.equalsIgnoreCase("eliminar"))
        {
            int id_pieza=Integer.parseInt(request.getParameter("id"));
            pi.setId_pieza(id_pieza);
            
            dao.eliminar(id_pieza);
            
             acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    
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
