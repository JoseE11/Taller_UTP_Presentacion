<%-- 
    Document   : Ed_Tecnico
    Created on : 11/06/2022, 12:26:29 AM
    Author     : Usuario
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Entidad.Tecnico"%>
<%@page import="java.util.List"%>
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
                    <h1 class="h3 mb-2 text-gray-800">Modificar Tecnicos</h1>
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h5 class="m-0 font-weight-bold text-primary">Datos de Tecnico</h5>
                        </div>
                        <div class="p-5">
                            <%
                                 TecnicoDAO dao = new TecnicoDAO();
                                 int id = Integer.parseInt((String)request.getAttribute("idper"));
                                 Tecnico ter = (Tecnico) dao.list(id);
          %>
                            <form class="user" action="ServletTecnico" >
                                
                                <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" name="txtDni" value="<%= ter.getDNI()%>"
                                            placeholder="DNI">
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" name="txtNombre" value="<%= ter.getNombre() %>"
                                            placeholder="Nombres">
                                    </div>
                                    <div class="col-sm-4">
                                        <input type="text" class="form-control form-control-user" name="txtApellido_pa" value="<%= ter.getAp_paterno()%>"
                                            placeholder="Apellido Paterno">
                                    </div>
                                    <div class="col-sm-4">
                                        <input type="text" class="form-control form-control-user"  name="txtApellido_ma" value="<%= ter.getAp_materno()%>"
                                            placeholder="Apellido Materno">
                                    </div>
                                </div>
                                <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Contactos</h6>
                                </div>
                                <div class="form-group row">
                                    <input type="email" class="form-control form-control-user col-sm-8 mb-3 mb-sm-0" name="txtCorreo" value="<%= ter.getCorreo_electronico()%>"
                                        placeholder="Correo Electronico">
                                    <div class="col-sm-4">
                                        <input type="number" class="form-control form-control-user"  name="txtTelefono" value="<%= ter.getTelefono()%>"
                                            placeholder="Telefono">
                                    </div>
                                </div>
                                <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Historial</h6>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user"  name="txtEspecialidad" value="<%= ter.getEspecialidad()%>"
                                            placeholder="Especialidad">
                                    </div>
                                </div>
                                <div class="mb-3">
                                    <textarea class="form-control " name="txtExperiencia"  value="<%= ter.getExperiencia_labo()%>" rows="3" placeholder="Experiencia Laboral"></textarea>
                                </div>
                                <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Horario</h6>
                                <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="number" class="form-control form-control-user"  name="txtHorario" value="<%= ter.getHorario()%>"
                                            placeholder="Horario">
                                    </div>
                                </div>
                                </div>
                               <input type="hidden" name="txtDni" value="<%= ter.getDNI() %>">
                                    <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
                                <a href="#" class="btn btn-success btn-icon-split" type="submit">
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

    <!-- Logout Modal-->
    

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

