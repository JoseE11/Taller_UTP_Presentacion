
package Controlador;
import Entidad.Cliente;
import Entidad.Tecnico;
import Modelo.TecnicoDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ControladorTecnico extends HttpServlet {
    
    String listar="webTecnico.jsp";
String add="index.jsp";
String edit="vistas/edit.jsp";

TecnicoDAO dao =new TecnicoDAO();
Tecnico te  =new Tecnico();
Cliente cli  = new Cliente();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet (HttpServletRequest request,HttpServletResponse response )
            throws ServletException, IOException
    {
        String acceso="";
        String action=request.getParameter("accion");
        if (action.equalsIgnoreCase("listar"))
        {
            acceso=listar;
        }else if(action.equalsIgnoreCase("Agregar"))
                {
                    int dni = Integer.parseInt(request.getParameter("txtDni"));
                    String nom = request.getParameter("txtNopmbre");
                    String ape = request.getParameter("txtApellidos");
                    String dir = request.getParameter("txtDirección");
                    int tel = Integer.parseInt(request.getParameter("txtTelefono"));
                    String cor = request.getParameter("txtCorreo");
                    String esp = request.getParameter("txtEspecialidad");
                    String exp = request.getParameter("txtExperienecia");
                    te.setDNI(dni);
                    te.setNombre(nom);
                    te.setAp_paterno(ape);
                    cli.setDireccion(dir);
                    te.setTelefono(tel);
                    te.setCorreo_electronico(cor);
                    te.setEspecialidad(esp);
                    te.setExperiencia_labo(exp);
                    
                    
                    dao.add(te, cli);
                }
        else if (action.equalsIgnoreCase("Modificar")) 
        {
            request.setAttribute("idper",request.getParameter("id"));
            acceso=edit; 
        }
        else if (action.equalsIgnoreCase("Actualizar")) 
        {
            
            int dni = Integer.parseInt(request.getParameter("txtDni"));
                    String nom = request.getParameter("txtNopmbre");
                    String ape = request.getParameter("txtApellidos");
                    String dir = request.getParameter("txtDirección");
                    int tel = Integer.parseInt(request.getParameter("txtTelefono"));
                    String cor = request.getParameter("txtCorreo");
                    String esp = request.getParameter("txtEspecialidad");
                    String exp = request.getParameter("txtExperienecia");
                    te.setDNI(dni);
                    te.setNombre(nom);
                    te.setAp_paterno(ape);
                    cli.setDireccion(dir);
                    te.setTelefono(tel);
                    te.setCorreo_electronico(cor);
                    te.setEspecialidad(esp);
                    te.setExperiencia_labo(exp);
                    
                    
                    dao.add(te, cli);
            acceso=listar;
        }
        else if (action.equalsIgnoreCase("Eliminar"))
        {
            int dni=Integer.parseInt(request.getParameter("id"));
            te.setDNI(dni);
            
            dao.eliminar(dni);
            
             acceso=listar;
        }
        RequestDispatcher vista=(RequestDispatcher) request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

}


