/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Cliente;
import Entidad.Distrito;
import Modelo.ClienteDAO;
import Modelo.DAODistrito;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ServletCliente", urlPatterns = {"/ServletCliente"})
public class ServletCliente extends HttpServlet {
    
    String listar="/Hj_RegistroCliente.jsp";
    String add="index.jsp";
    String edit="/Ed_Cliente.jsp";
    ClienteDAO dao = new ClienteDAO();
    Cliente cli = new Cliente();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
              this.cargarDistritos(request);
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCliente</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletCliente at " + request.getContextPath() + "</h1>");
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
            
                    String nom = request.getParameter("txtNombre");
                    String ape_pa = request.getParameter("txtApellido_pa");
                    String ape_ma = request.getParameter("txtApellido_ma");
                    String dis = request.getParameter("txtDistrito");
                    String dire = request.getParameter("txtDireccion");
                    int tel = Integer.parseInt(request.getParameter("txtTelefono"));
                    String cor = request.getParameter("txtCorreo");
              
                    cli.setNombre(nom);
                    cli.setAp_paterno(ape_pa);
                    cli.setAp_materno(ape_ma);
                    cli.setDistrito(dis);
                    cli.setDireccion(dire);
                    cli.setTelefono(tel);
                    cli.setCorreo_electronico(cor);
    
                    dao.edit(cli);
            acceso=listar;
        }
        else if (action.equalsIgnoreCase("eliminar"))
        {
            int dni=Integer.parseInt(request.getParameter("dni"));
            cli.setDNI(dni);
            
            dao.eliminar(dni);
            
             acceso=listar;
        }
        RequestDispatcher vista=(RequestDispatcher) request.getRequestDispatcher(acceso);
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
    
        private void cargarDistritos(HttpServletRequest request){
        DAODistrito daodis = new DAODistrito();
        List<Distrito> dist = null;
        try{
            dist = daodis.listar();
            request.setAttribute("Distrito", dist);
        }catch(Exception e){
            
        }finally{
            dist=null;
            daodis=null;
        }
    }

}
