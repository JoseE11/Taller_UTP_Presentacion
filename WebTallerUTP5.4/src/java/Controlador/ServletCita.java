/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Entidad.Cita;
import Modelo.CitaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author User
 */
@WebServlet(name = "ServletCita", urlPatterns = {"/ServletCita"})
public class ServletCita extends HttpServlet {
  String listar="/Ad_citas.jsp";
  String add="index.jsp";
  String edit="/Ed_Citas.jsp";
  CitaDAO dao = new CitaDAO();
  Cita cit = new Cita();
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
            out.println("<title>Servlet ServletCita</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletCita at " + request.getContextPath() + "</h1>");
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
                    int id_cita = Integer.parseInt(request.getParameter("txtid_cita"));
                    int dni_cliente = Integer.parseInt(request.getParameter("txtid_cita"));
                    int dni_tecnico = Integer.parseInt(request.getParameter("txtid_cita"));
                    Date fecha = Date.valueOf(request.getParameter("txtfecha"));
                    Time hora = Time.valueOf(request.getParameter("txthora"));
             
                    cit.setId_cita(id_cita);
                    cit.setDni_cliente(dni_cliente);
                    cit.setDni_tecnico(dni_tecnico);
                    cit.setFecha_cita(fecha);
                    cit.setHora_cita(hora);

                    dao.add(cit);
                    acceso=listar;
                }
        else if (action.equalsIgnoreCase("editar")) 
        {
            request.setAttribute("idper",request.getParameter("id"));
            acceso=edit; 
        }
        else if (action.equalsIgnoreCase("actualizar")) 
        {
            
           int id_cita = Integer.parseInt(request.getParameter("txtid_cita"));
                    int dni_cliente = Integer.parseInt(request.getParameter("txtdni_cliente"));
                    int dni_tecnico = Integer.parseInt(request.getParameter("txtid_cita"));
                    Date fecha = Date.valueOf(request.getParameter("txtfecha"));
                    Time hora = Time.valueOf(request.getParameter("txthora"));
             
                    cit.setId_cita(id_cita);
                    cit.setDni_cliente(dni_cliente);
                    cit.setDni_tecnico(dni_tecnico);
                    cit.setFecha_cita(fecha);
                    cit.setHora_cita(hora);

                    dao.edit(cit);
                    acceso=listar;
         
        }
        else if (action.equalsIgnoreCase("eliminar"))
        {
            int id_cita=Integer.parseInt(request.getParameter("id"));
            cit.setId_cita(id_cita);
            
            dao.eliminar(id_cita);
            
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
