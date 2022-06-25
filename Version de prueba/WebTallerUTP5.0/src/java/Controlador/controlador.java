/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Cliente;
import Entidad.Persona;
import Entidad.Tecnico;
import Entidad.distrito;
import Entidad.horario;
import Modelo.ClienteDAO;
import Modelo.DAODistrito;
import Modelo.DAOHorario;
import Modelo.TecnicoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "controlador", urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {
ClienteDAO dao = new ClienteDAO();
TecnicoDAO  daotec=new TecnicoDAO ();
Cliente cli = new Cliente();
Tecnico tec = new Tecnico();
int ide;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String menu = request.getParameter("menu");
       String accion = request.getParameter("accion");
       if(menu.equals("Cliente")){
           this.cargarDistritos(request);
           switch(accion){
               case "Listar":
                   List lista = dao.listar();
                   request.setAttribute("cliente", lista);
                   break;
               case "Agregar":
                   int dni = Integer.parseInt(request.getParameter("txtDni"));
                    String nom = request.getParameter("txtNopmbre");
                    String ape_pa = request.getParameter("txtApellido_pa");
                    String ape_ma = request.getParameter("txtApellido_ma");
                    int dis = Integer.parseInt(request.getParameter("txtDistrito"));
                    String dire = request.getParameter("txtDireccion");
                    int tel = Integer.parseInt(request.getParameter("txtTelefono"));
                    String cor = request.getParameter("txtCorreo");
                    cli.setDNI(dni);
                    cli.setNombre(nom);
                    cli.setAp_paterno(ape_pa);
                    cli.setAp_materno(ape_ma);
                    cli.setId_distrito(dis);
                    cli.setDireccion(dire);
                    cli.setTelefono(tel);
                    cli.setCorreo_electronico(cor);
                    dao.add(cli);
                    request.getRequestDispatcher("controlador?menu=Cliente&accion=Listar").forward(request, response);
                   break;
               case "Editar":
                   ide=Integer.parseInt(request.getParameter("id"));
                   Persona p=dao.list(ide);
                   request.setAttribute("cliente", p);
                   request.getRequestDispatcher("Ed_Cliente.jsp").forward(request, response);
                   break;
                case "Actualizar":
                    int dni1 = Integer.parseInt(request.getParameter("txtDni"));
                    String nom1 = request.getParameter("txtNopmbre");
                    String ape_pa1 = request.getParameter("txtApellido_pa");
                    String ape_ma1 = request.getParameter("txtApellido_ma");
                    int dis1 = Integer.parseInt(request.getParameter("txtDistrito"));
                    String dire1 = request.getParameter("txtDireccion");
                    int tel1 = Integer.parseInt(request.getParameter("txtTelefono"));
                    String cor1 = request.getParameter("txtCorreo");
                    cli.setDNI(dni1);
                    cli.setNombre(nom1);
                    cli.setAp_paterno(ape_pa1);
                    cli.setAp_materno(ape_ma1);
                    cli.setId_distrito(dis1);
                    cli.setDireccion(dire1);
                    cli.setTelefono(tel1);
                    cli.setCorreo_electronico(cor1);
                    dao.edit(cli);
                    request.getRequestDispatcher("controlador?menu=Cliente&accion=Listar").forward(request, response);
                   break;
               case "Eliminar":
                     ide=Integer.parseInt(request.getParameter("id"));
                     cli.setDNI(ide);
                     dao.eliminar(cli);
                     request.getRequestDispatcher("controlador?menu=Cliente&accion=Listar").forward(request, response);
                   break;
               default:
                   throw new AssertionError();
           }
           request.getRequestDispatcher("Hj_RegistroUsuario.jsp").forward(request, response);
       }
       if(menu.equals("Tecnico")){
           this.cargarHorarios(request);
           switch(accion){
               case "Listar":
                   List lista = daotec.listar();
                   request.setAttribute("tecnico", lista);
                   break;
               case "Agregar":
                   int dni = Integer.parseInt(request.getParameter("txtDni"));
                    String nom = request.getParameter("txtNombre");
                    String ape_pa = request.getParameter("txtApellido_pa");
                    String ape_ma = request.getParameter("txtApellido_ma");
                    int ho = Integer.parseInt(request.getParameter("txtHorario"));
                    String esp = request.getParameter("txtEspecialidad");
                    String exp = request.getParameter("txtExperiencia");
                    int tel = Integer.parseInt(request.getParameter("txtTelefono"));
                    String cor = request.getParameter("txtCorreo");
                    
                    tec.setDNI(dni);
                    tec.setNombre(nom);
                    tec.setAp_paterno(ape_pa);
                    tec.setAp_materno(ape_ma);
                    tec.setHorario(ho);
                    tec.setEspecialidad(esp);
                    tec.setExperiencia_labo(exp);
                    tec.setTelefono(tel);
                    tec.setCorreo_electronico(cor);
                    
                    daotec.add(tec);
                    request.getRequestDispatcher("controlador?menu=Tecnico&accion=Listar").forward(request, response);
                   break;
               case "Editar":
                   ide=Integer.parseInt(request.getParameter("id"));
                   Persona p=daotec.list(ide);
                   request.setAttribute("tecnico", p);
                  
                   request.getRequestDispatcher("Ed_Tecnico.jsp").forward(request, response);
                   break;
                case "Actualizar":
                    int dni1 = Integer.parseInt(request.getParameter("txtDni"));
                    String nom1 = request.getParameter("txtNombre");
                    String ape_pa1 = request.getParameter("txtApellido_pa");
                    String ape_ma1 = request.getParameter("txtApellido_ma");
                    int ho1 = Integer.parseInt(request.getParameter("txtHorario"));
                    String esp1 = request.getParameter("txtEspecialidad");
                    String exp1 = request.getParameter("txtExperiencia");
                    int tel1 = Integer.parseInt(request.getParameter("txtTelefono"));
                    String cor1 = request.getParameter("txtCorreo");
                    
                    tec.setDNI(dni1);
                    tec.setNombre(nom1);
                    tec.setAp_paterno(ape_pa1);
                    tec.setAp_materno(ape_ma1);
                    tec.setHorario(ho1);
                    tec.setEspecialidad(esp1);
                    tec.setExperiencia_labo(exp1);
                    tec.setTelefono(tel1);
                    tec.setCorreo_electronico(cor1);
                    daotec.edit(tec);
                    request.getRequestDispatcher("controlador?menu=Tecnico&accion=Listar").forward(request, response);
                   break;
               case "Eliminar":
                     ide=Integer.parseInt(request.getParameter("id"));
                     tec.setDNI(ide);
                     daotec.eliminar(tec);
                     request.getRequestDispatcher("controlador?menu=Tecnico&accion=Listar").forward(request, response);
                   break;
               default:
                   throw new AssertionError();
           }
           request.getRequestDispatcher("Ad_Tecnico.jsp").forward(request, response);
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
        DAODistrito dao = new DAODistrito();
        List<distrito> dist = null;
        try{
            dist = dao.listar();
            request.setAttribute("distrito", dist);
        }catch(Exception e){
            
        }finally{
            dist=null;
            dao=null;
        }
    }
    private void cargarHorarios(HttpServletRequest request){
        DAOHorario dao = new DAOHorario();
        List<horario> dist = null;
        try{
            dist = dao.listar();
            request.setAttribute("horario", dist);
        }catch(Exception e){
            
        }finally{
            dist=null;
            dao=null;
        }
    }
}
