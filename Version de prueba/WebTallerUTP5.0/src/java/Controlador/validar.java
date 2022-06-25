 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Persona;
import Entidad.tipo_persona;
import Modelo.PersonaDAO;
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
@WebServlet(name = "validar", urlPatterns = {"/validar"})
public class validar extends HttpServlet {

    PersonaDAO dao = new PersonaDAO();
    Persona per = new Persona();
    int r;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
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
         String accion=request.getParameter("accion");
        if(accion.equalsIgnoreCase("Ingresar"))
        {
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
            }*/
            String user=request.getParameter("txtuser");
            int pass=Integer.parseInt(request.getParameter("txtpass"));
            
            per=dao.validar(user, pass);
            if(per.getCorreo_electronico()!=null && per.getTipo().equals("Tecnico")){
                request.getSession().setAttribute("persona", per);
                
                request.getRequestDispatcher("controlador?menu=Cliente&accion=Listar").forward(request, response);
            }else if(per.getCorreo_electronico()!=null && per.getTipo().equals("Administrador")){
                request.getSession().setAttribute("persona", per);
                
                 request.getRequestDispatcher("controlador?menu=Tecnico&accion=Listar").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
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
