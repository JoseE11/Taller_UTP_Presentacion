<%-- 
    Document   : Ed_Usuario
    Created on : 10/06/2022, 11:42:47 PM
    Author     : Usuario
--%>

<%@page import="Entidad.Usuario"%>
<%@page import="Modelo.UsuarioDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="Entidad.Pieza"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.PiezaDAO"%>
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
                    <h1 class="h3 mb-2 text-gray-800">Modificar Usuario</h1>
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h5 class="m-0 font-weight-bold text-primary">Datos de Usuario</h5>
                        </div>
                        <div class="p-5">
                            <%
                                UsuarioDAO dao = new UsuarioDAO();
                                 int id = Integer.parseInt((String) request.getAttribute("idper"));
                                   Usuario p = (Usuario) dao.list(id);
          %>
                            <form class="user" action="ServletUsuario">
                                
                                  <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">ID Usuario</h6>
                                </div>
                                
                                <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                    <input type="text" class="form-control form-control-user" name="txtid_usuario" value="<%= p.getId_usuario()%>"
                                            placeholder="ID usuario">
                                    </div>
                                </div>
                                            

                                   <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Nombre de Usuario</h6>
                                </div>
                                
                                <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                    <input type="text" class="form-control form-control-user" name="txtnombre_usuario" value="<%= p.getNombre_usuario()%>"
                                            placeholder="Nombre Usuario">
                                    </div>
                                </div>
                                            <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Rol de Usuario</h6>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" name="txtid_rol" value="<%= p.getRol()%>"
                                            placeholder="ID ROL">
                                </div>
                                </div>
                                     <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Contraseña</h6>
                                </div>
                        <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" name="txtcontraseña"  value="<%= p.getContraseña()%>"

                                            placeholder="Contraseña">
                                </div>
                                    <input type="hidden" name="txtid_pieza" value="<%= p.getId_usuario()%>">
                                    <input class="btn btn-primary" type="submit" name="accion" value="actualizar">
                                    <a href="#" class="btn btn-success btn-icon-split">
                                        <span class="icon text-white-50">
                                            <i class="fas fa-check"></i>
                                        </span>
                                  
                                    </a>
                            </form>
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
