/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Equipos;
import Modelo.EquiposDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "ServletEquipos", urlPatterns = {"/ServletEquipos"})
public class ServletEquipos extends HttpServlet {

    String listar="/Ad_Piezas.jsp";
String add="index.jsp";
String edit="/Ed_Pieza.jsp";

EquiposDAO dao =new EquiposDAO();
Equipos equ  =new Equipos();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletEquipos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletEquipos at " + request.getContextPath() + "</h1>");
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
                    int id_equipo = Integer.parseInt(request.getParameter("txtid_pieza"));
                    int id_tipo_equipo = Integer.parseInt(request.getParameter("txtid_pieza"));
                    int dni = Integer.parseInt(request.getParameter("txtid_pieza"));
                    String marca = request.getParameter("txtnombre_pieza");
                    String modelo = request.getParameter("txtdes_pieza");
                    
            
                    
                   equ.setId_equipo(id_equipo);
                   equ.setId_tipo_equipo(id_tipo_equipo);
                   equ.setDni(dni);
                   equ.setMarca(marca);
                   equ.setModelo(modelo);
                   equ.setEstado_equipo(true);
                    dao.add(equ);
                    acceso=listar;
                }
        else if (action.equalsIgnoreCase("editar")) 
        {
            request.setAttribute("id_pieza",request.getParameter("id"));
            acceso=edit; 
        }
        else if (action.equalsIgnoreCase("Actualizar")) 
        {
                    int id_equipo = Integer.parseInt(request.getParameter("txtid_pieza"));
                    int id_tipo_equipo = Integer.parseInt(request.getParameter("txtid_pieza"));
                    int dni = Integer.parseInt(request.getParameter("txtid_pieza"));
                    String marca = request.getParameter("txtnombre_pieza");
                    String modelo = request.getParameter("txtdes_pieza");
                    
            
                    
                   equ.setId_equipo(id_equipo);
                   equ.setId_tipo_equipo(id_tipo_equipo);
                   equ.setDni(dni);
                   equ.setMarca(marca);
                   equ.setModelo(modelo);
                   equ.setEstado_equipo(true);
                    dao.add(equ);
                    acceso=listar;
        }
        else if (action.equalsIgnoreCase("eliminar"))
        {
            int id_equipo=Integer.parseInt(request.getParameter("id"));
            equ.setId_equipo(id_equipo);
            
            dao.eliminar(id_equipo);
            
             acceso=listar;
        }
        javax.servlet.RequestDispatcher vista=request.getRequestDispatcher(acceso);
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
