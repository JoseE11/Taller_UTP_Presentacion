<%-- 
    Document   : Hj_Salida
    Created on : 09/06/2022, 04:05:37 PM
    Author     : Usuario
--%>

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
                    <h1 class="h3 mb-2 text-gray-800">Hoja de Salida</h1>
                    <div class="row">
                        <!-- Tasks Card Example -->
                        <div class="col-xl-6 col-md-8 mb-4">
                            <div class="card border-left-info shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class=" h5 font-weight-bold text-info text-uppercase mb-1">Datos Cliente
                                            </div>
                                            <div class="row no-gutters align-items-center">
                                                <div class="col-auto">
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        DNI:
                                                    </div>
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        Nombres : 
                                                    </div>
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        Apellidos :
                                                    </div>
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        Dirección :
                                                    </div>
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        Telefono :
                                                    </div>
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        Correo Electronico:
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-auto">
                                            <i class="fas fa-user-check fa-2x text-gray-300"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Pending Requests Card Example -->
                        <div class="col-xl-6 col-md-8 mb-4">
                            <div class="card border-left-warning shadow h-100 py-2">
                                <div class="card-body">
                                    <div class="row no-gutters align-items-center">
                                        <div class="col mr-2">
                                            <div class="h5 font-weight-bold text-warning text-uppercase mb-1">
                                                Datos Equipo</div>
                                            <div class="col-auto">
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        ID:
                                                    </div>
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        Tipo : 
                                                    </div>
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        Marca :
                                                    </div>
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        Modelo :
                                                    </div>
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        Estado del Equipo :
                                                    </div>
                                                    <div class="h6 mb-0 mr-3 font-weight-bold text-gray-500 py-1">
                                                        Correo Electronico:
                                                    </div>
                                                </div>
                                        </div>
                                        <div class="col-auto">
                                            <i class="fas fa-briefcase fa-2x text-gray-300"></i>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                     <h1 class="h3 mb-2 text-gray-800">Datos del Servicio</h1>
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h5 class="m-0 font-weight-bold text-primary">Datos del Servicio</h5>
                        </div>
                        <div class="p-5">
                        <form class="user">
                                <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                            placeholder="Fecha">
                                    </div>
                                </div>
                             <div class=" py-3">
                                    <h6 class="m-0 font-weight-bold text-primary">Servicio</h6>
                                </div>
                            <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <select class="form-select form-control " >
                                            <option selected>Tipo de Servicio</option>
                                            <option value="1">Socabaya</option>
                                            <option value="2">Cercado</option>
                                            <option value="3">JLBYR</option>
                                        </select>
                                    </div>
                                </div>
                                <div class=" py-2">
                                    <h6 class="m-0 font-weight-bold text-primary">Repuestos</h6>
                                </div>
                            
                            <!-- DataTales Example -->
                    <div class="card shadow mb-4 ">
                        <div class="card-header py-3 ">
                            <div class="row align-items-center modal-header"> 
                            <div class="col-sm8">   
                            <h6 class="m-0 font-weight-bold text-primary ">Tabla de Repuestos Usados</h6>
                            </div>
                            <div class="col-sm4 align-items-center">  
                            <a href="#" class="btn btn-success btn-icon-split" data-toggle="modal" data-target="#logoutModa3">
                                        <span class="icon text-white-50">
                                            <i class="fas fa-check"></i>
                                        </span>
                                        <span class="text">Agregar</span>
                                    </a>
                            </div>
                            </div> 
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>Nombre de Pieza</th>
                                            <th>Descripción</th>
                                            <th>Accion</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>ID</th>
                                            <th>Nombre de Pieza</th>
                                            <th>Descripción</th>
                                            <th>Accion</th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                        <tr>
                                            <td>Tiger Nixon</td>
                                            <td>System Architect</td>
                                            <td>Edinburgh</td>
                                            <td>
                                                <a href="#" class="btn btn-danger btn-icon-split">
                                                    <span class="icon text-white-50">
                                                        <i class="fas fa-trash"></i>
                                                    </span>
                                                    <span class="text">Eliminar</span>
                                                </a>
                                            </td>
                                        </tr>
                                        
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                            <div class=" py-2">
                                    <h6 class="m-0 font-weight-bold text-primary">Total</h6>
                                </div>
                            <div class="form-group row">
                                    <div class="col-sm-4 mb-3 mb-sm-0">
                                        <input type="text" class="form-control form-control-user" id="exampleFirstName"
                                            placeholder="Total a Pagar">
                                    </div>
                                </div>
                                    
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

   
    <div class="modal fade" id="logoutModa3" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabe3"
        aria-hidden="true">
        <div class="modal-dialog" role="document" style="max-width: 600px">
            <div class="modal-content">
                <div class="modal-header">
                    <h6 class="m-0 font-weight-bold text-primary">Tabla de Repuestos</h6>
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
                                            <th>Nombre de Pieza</th>
                                            <th>Descripción</th>
                                            <th>Accion</th>
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>ID</th>
                                            <th>Nombre de Pieza</th>
                                            <th>Descripción</th>
                                            <th>Accion</th>
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                        <tr>
                                            <td>Tiger Nixon</td>
                                            <td>System Architect</td>
                                            <td>Edinburgh</td>
                                            <td>
                                                <a href="#" class="btn btn-info btn-icon-split" >
                                                    <span class="icon text-white-50">
                                                        <i class="fas fa-info-circle"></i>
                                                    </span>
                                                    <span class="text">Agregar</span>
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
