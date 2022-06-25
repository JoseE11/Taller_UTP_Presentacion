<%-- 
    Document   : Hj_RegistroUsuario
    Created on : 08/06/2022, 05:47:06 PM
    Author     : Usuario
--%>

<%@page import="Entidad.Usuario"%>
<%@page import="Modelo.UsuarioDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="Entidad.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.ClienteDAO"%>
<%@page import="Modelo.TecnicoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Dashboard</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">
    <link href="css/clockpicker.css" rel="stylesheet" type="text/css"/>
</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
        <%@include file="Sidebar.jsp" %>
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <%@include file="Topbar.jsp" %>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Registro de Usuarios</h1>
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h5 class="m-0 font-weight-bold text-primary">Datos de Usuario</h5>
                        </div>
                        <div class="p-5">
                        <form class="user" action="ServletUsuario" >
                            <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">ID de Usuario</h6>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" name="txtid_usuario"
                                            placeholder="ID">
                                    </div>
                                </div>
                               <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Rol de Usuario</h6>
                                </div>
                                
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user"  name="txtid_rol"
                                            placeholder="ID del Rol">
                                    </div>
                                 <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Ingrese DNI</h6>
                                </div>
                                    <div class="col-sm-4">
                                        <input type="text" class="form-control form-control-user"  name="txtdni"
                                            placeholder="DNI">
                                    </div>
              
                            <div class="form-group row">
                          
                            </div>
                             <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Nombre de Usuario</h6>
                                </div>
                                
                                <div class="form-group row">
                                    <input type="text" class="form-control form-control-user col-sm-8 mb-3 mb-sm-0"  name="txtnombre_usuario"
                                        placeholder="Nombre Usuario">
                         
                                </div>
                            <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Contraseña</h6>
                                </div>
                             <div class="form-group row">
                                    <input type="text" class="form-control form-control-user col-sm-8 mb-3 mb-sm-0"  name="txtcontraseña"
                                        placeholder="Contraseña">
                         
                                </div>
                                
                                    <a href="#" class="btn btn-success btn-icon-split">
                                       
                                      <input type="submit" name="accion" value="agregar">
                                    </a>
                            </form>
                        </div>
                    </div>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Tabla de Usuarios</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Nombre Usuario</th>
                                            <th>DNI</th>
                                            <th>ID ROL</th>
                                            <th>Acciones</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>ID</th>
                                            <th>Nombre Usuario</th>
                                            <th>DNI</th>
                                            <th>ID ROL</th>
                                            <th>Acciones</th>
                                        </tr>
                                    </tfoot>
                                     <%
                                        UsuarioDAO dao = new UsuarioDAO();
                                        List<Usuario> list = dao.listar();
                                        Iterator<Usuario> iter = list.iterator();
                                        Usuario usu = null;
                                        while (iter.hasNext()) {
                                            usu= iter.next();

                                    %>
                                    <tbody>
                                        <tr>
                                            <th><%= usu.getId_usuario()%></th>
                                            <td><%= usu.getNombre_usuario()%></td>
                                            <td><%= usu.getDni_ref()%></td>
                                            <td><%= usu.getRol() %></td>
                                            <td>
                                                <a href="ServletUsuario?accion=editar&id=<%= usu.getId_usuario()%>" class="btn btn-info btn-icon-split">
                                                    <span class="icon text-white-50">
                                                        <i class="fas fa-info-circle"></i>
                                                    </span>
                                                    <span class="text">Editar</span>
                                                </a>
                                                <a href="ServletUsuario?accion=eliminar&dni=<%= usu.getId_usuario()%>" class="btn btn-danger btn-icon-split">
                                                    <span class="icon text-white-50">
                                                        <i class="fas fa-trash"></i>
                                                    </span>
                                                    <span class="text">Eliminar</span>
                                                </a>
                                            </td>
                                        </tr>
                                        <%}%>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                 
                
                <!-- /.container-fluid -->
            </div>
            <!-- End of Main Content -->
            
            <!-- Footer -->
             <%@include file="footer.jsp" %>
           </div>
        </div>
        <!-- End of Content Wrapper -->

    </div>
    <!-- End of Page Wrapper -->

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

   
    <div class="modal fade" id="logoutModa2" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabe2"
        aria-hidden="true">
        <div class="modal-dialog" role="document" style="max-width: 600px">
            <div class="modal-content">
                <div class="modal-header">
                    <h6 class="m-0 font-weight-bold text-primary">Tabla de Equipos</h6>
                    <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                    </button>
                </div>
                   <div class="card shadow mb-4">
                        
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Tipo</th>
                                            <th>Marca</th>
                                            <th>Modelo</th>
                                            <th>Hoja de Salida</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>ID</th>
                                            <th>Tipo</th>
                                            <th>Marca</th>
                                            <th>Modelo</th>
                                            <th>Hoja de Salida</th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                        <tr>
                                            <td>Tiger Nixon</td>
                                            <td>System Architect</td>
                                            <td>Edinburgh</td>
                                            <td>61</td>
                                            <td>
                                                <a href="#" class="btn btn-info btn-icon-split">
                                                    <span class="icon text-white-50">
                                                        <i class="fas fa-info-circle"></i>
                                                    </span>
                                                    <span class="text">Realizar</span>
                                                </a>
                                            </td>
                                        </tr>
                                        
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                
            </div>
        </div>
    </div>

    <!-- Bootstrap core JavaScript-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Core plugin JavaScript-->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for all pages-->
    <script src="js/sb-admin-2.min.js"></script>

    <!-- Page level plugins -->
    <script src="vendor/chart.js/Chart.min.js"></script>
     <script src="vendor/datatables/jquery.dataTables.min.js"></script>
    <script src="vendor/datatables/dataTables.bootstrap4.min.js"></script>

    <!-- Page level custom scripts -->
    <script src="js/demo/chart-area-demo.js"></script>
    <script src="js/demo/chart-pie-demo.js"></script>
    <script src="js/demo/datatables-demo.js"></script>
    
    <script src="js/clockpicker.js" type="text/javascript"></script>
    <script type="text/javascript">
$('.clockpicker').clockpicker();
    </script>
</body>

</html>
