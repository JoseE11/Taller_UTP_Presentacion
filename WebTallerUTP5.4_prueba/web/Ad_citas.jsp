<%-- 
    Document   : Ad_citas
    Created on : 17/06/2022, 11:30:50 PM
    Author     : Usuario
--%>

<%@page import="Modelo.CitaDAO"%>
<%@page import="Entidad.Cita"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Iterator"%>
<%@page import="Entidad.Cliente"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

    <title>SB Admin 2 - Citas</title>

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
                    <h1 class="h3 mb-2 text-gray-800">Registro de Citas</h1>
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h5 class="m-0 font-weight-bold text-primary">Datos de Usuario</h5>
                        </div>
                        <div class="p-5">
                            <form class="user" action="ServletCita" >
                               
                                <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user"  name="txtid_cita"
                                            placeholder="ID Cita">
                                    </div>
                                    <div class="col-sm-4">
                                        <input type="text" class="form-control form-control-user"  name="txtdni_cliente"
                                            placeholder="Dni Cliente">
                                    </div>
                                    <div class="col-sm-4">
                                        <input type="text" class="form-control form-control-user"  name="txtdni_tecnico"
                                            placeholder="Dni Tecnico">
                                    </div>
                                </div>
                             <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Fecha y Hora</h6>
                                </div>
                            
                                <div class="form-group row">
                                    <div class="col-sm-4">
                                    <input type="text" class="form-control form-control-user col-sm-8 mb-3 mb-sm-0" id="exampleInputEmail" name="txtfecha"
                                        placeholder="Fecha">
                                    </div>
                                    <div class="col-sm-4">
                                        <input type="text" class="form-control form-control-user" id="exampleLastName" name="txthora"
                                            placeholder=" Hora">
                                    </div>
                                </div>
                                
                                    <a href="#" class="btn btn-success btn-icon-split">
                                        <span class="icon text-white-50">
                                            <i class="fas fa-check"></i>
                                        </span>
                                        <input type="submit" name="accion" value="agregar">
                                    </a>
                            </form>
                        </div>
                    </div>

                    <!-- DataTales Example -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Tabla de Citas</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Dni Cliente</th>
                                            <th>Dni Tecnico</th>
                                            <th>Fecha</th>
                                            <th>Hora</th>
                                            <th>Accion</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>ID</th>
                                            <th>Dni Cliente</th>
                                            <th>Dni Tecnico</th>
                                            <th>Fecha</th>
                                            <th>Hora</th>
                                            <th>Accion</th>
                                        </tr>
                                    </tfoot>
                                     <%
                                        CitaDAO dao = new CitaDAO();
                                        List<Cita> list = dao.listar();
                                        Iterator<Cita> iter = list.iterator();
                                        Cita cit = null;
                                        while (iter.hasNext()) {
                                            cit = iter.next();

                                    %>
                                    <tbody>
                                        <tr>
                                            <th><%= cit.getId_cita()%></th>
                                            <td><%= cit.getDni_cliente()%></td>
                                            <td><%= cit.getDni_tecnico()%></td>
                                            <td><%= cit.getFecha_cita()%></td>
                                            <td><%= cit.getHora_cita()%></td>
                                            <td>
                                                <a href="ServletCita?accion=editar&id=<%= cit.getId_cita()%>" class="btn btn-info btn-icon-split">
                                                    <span class="icon text-white-50">
                                                        <i class="fas fa-info-circle"></i>
                                                    </span>
                                                    <span class="text">Editar</span>
                                                </a>
                                                <a href="ServletCita?accion=eliminar&id=<%= cit.getId_cita()%>" class="btn btn-danger btn-icon-split">
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

