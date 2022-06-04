
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    
    <title>Equipos</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <script src="https://kit.fontawesome.com/20a21d54c9.js" crossorigin="anonymous"></script>
 
    <link href="css/sidebars.css" rel="stylesheet" type="text/css"/>
  </head>
  <body>
      <div class="container-fluid">
          <div class="row container-fluid " style="padding: 0" >
              <div class="col-3 " style="padding: 0" >
                  <main class="d-flex flex-nowrap">
                      <h1 class="visually-hidden"></h1>

                      <div class="d-flex flex-column flex-shrink-0 p-3 text-white bg-dark" style="width: 280px; min-height: 100vh">
                          <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
                              <svg class="bi pe-none me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
                              <span class="fs-4">Taller UTP</span>
                          </a>
                          <hr>
                          <ul class="nav nav-pills flex-column mb-auto">

                              <li class="mb-1">

                                  <button class="text-white link-dark btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#home-collapse" aria-expanded="true">
                                      <i class="fa-solid fa-angle-right btn-toggle"></i> Administración
                                  </button>
                                  <div class="collapse show" id="home-collapse">
                                      <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                          <li><a href="#" class="text-white link-dark d-inline-flex text-decoration-none rounded">Administración Usuarios</a></li>
                                          <li><a href="#" class="text-white link-dark d-inline-flex text-decoration-none rounded">Administración Tecnicos</a></li>
                                          <li><a href="#" class="text-white link-dark d-inline-flex text-decoration-none rounded">Reports</a></li>
                                      </ul>
                                  </div>
                              </li>
                              <li class="mb-1">
                                  <button class="btn btn-toggle link-dark text-white d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#dashboard-collapse" aria-expanded="false">
                                      <i class="fa-solid fa-angle-right btn-toggle"></i> Taller
                                  </button>
                                  <div class="collapse" id="dashboard-collapse">
                                      <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                          <li><a href="#" class="link-dark text-white d-inline-flex text-decoration-none rounded">Hoja de Entrada</a></li>
                                          <li><a href="#" class="link-dark text-white d-inline-flex text-decoration-none rounded">Hoja de Salida</a></li>

                                      </ul>
                                  </div>
                              </li>
                              <li class="mb-1">
                                  <button class="btn btn-toggle link-dark text-white d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#orders-collapse" aria-expanded="false">
                                      <i class="fa-solid fa-angle-right btn-toggle"></i>Asignación Técnicos
                                  </button>
                                  <div class="collapse" id="orders-collapse">
                                      <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                          <li><a href="#" class="link-dark text-white  d-inline-flex text-decoration-none rounded">Lista de Técnicos</a></li>
                                      </ul>
                                  </div>
                              </li>
                              <li class="mb-1">
                                  <button class="btn link-dark btn-toggle text-white d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#account-collapse" aria-expanded="false">
                                      <i class="fa-solid fa-angle-right btn-toggle"></i>Cita
                                  </button>
                                  <div class="collapse" id="account-collapse">
                                      <ul class="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                          <li><a href="#" class="link-dark text-white d-inline-flex text-decoration-none rounded">Asiganar Cita</a></li>
                                      </ul>
                                  </div>

                          </ul>
                          <hr>
                          <div class="dropdown">
                              <a href="#" class="d-flex align-items-center text-white text-decoration-none dropdown-toggle" id="dropdownUser1" data-bs-toggle="dropdown" aria-expanded="false">
                                  <img src="https://github.com/mdo.png" alt="" width="32" height="32" class="rounded-circle me-2">
                                  <strong>mdo</strong>
                              </a>
                              <ul class="dropdown-menu dropdown-menu-dark text-small shadow" aria-labelledby="dropdownUser1">
                                  <li><a class="dropdown-item" href="#">New project...</a></li>
                                  <li><a class="dropdown-item" href="#">Settings</a></li>
                                  <li><a class="dropdown-item" href="#">Profile</a></li>
                                  <li><hr class="dropdown-divider"></li>
                                  <li><a class="dropdown-item" href="#">Sign out</a></li>
                              </ul>
                          </div>
                      </div>
                      <div class="d-flex flex-column align-items-stretch flex-shrink-0 bg-white" >

                      </div>

                      <div class="b-example-divider b-example-vr"></div>
                  </main>
                  <script src="assets/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
                  <script src="js/sidebars.js" type="text/javascript"></script>
              </div>
              <div class=" col container-fluid ">
              <div class=" conteiner w-100 align-items-center py-4 ">
               
            <div class="card ">
                <div class="card-body">
                    <h2 class="title">Registro de Equipos</h2>
                    <form method="POST">
                        <div class="row">
                            <div>
                            <div class="mb-3 col-5">
                                <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="id">
                            </div>
                                <div class="mb-3">
                                
                                </div>
                            </div>
                            <div class="row"style="padding-left: 20px;">
                                <h4>Tipo</h4>
                                <select class="form-select col" aria-label="Default select example" >
                                    <option selected>Tipo</option>
                                    <option value="1">Computadora</option>
                                    <option value="2">Celular</option>
                                    <option value="3">Laptop</option>
                                </select>
                            </div>
                            
                            <div class="row py-3">
                                <h4>Caracteristicas</h4>
                            <div class="mb-3 col">
                                <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="Marca">
                            </div>
                                <div class="mb-3 col">
                                <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="Modelo">
                            </div>
                            </div>
                            <div class="mb-3">
                                <label for="exampleFormControlTextarea1" class="form-label">Estado del Equipo</label>
                                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                            </div>
                        </div>
                        <button type="button" class="btn btn-secondary">Guardar</button>
                    </form>
                </div>
            </div>
      
                  
              </div>
              <div class="card">
                  <div class="card-body">
                      <table class="table">
                          <div class="container-fluid row" >
                              <div class="col">
                                  <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                              </div>
                              <div class="col">
                                  <button class="btn btn-outline-success" type="submit">Buscar</button>
                              </div>
                          </div>
                       
                      <thead>
                          <tr>
                              <th scope="col">ID</th>
                              <th scope="col">DNI</th>
                              <th scope="col">Tipo</th>
                              <th scope="col">Marca</th>
                              <th scope="col">Modelo</th>
                               <th scope="col">Proceso</th>
                          </tr>
                      </thead>
                      <tbody>
                          <tr>
                              <th scope="row">1</th>
                              <td>78894304</td>
                              <td>Celular</td>
                              <td>Huawei</td>
                              <td>P-30</td>
                              <td><button type="button" class="btn btn-dark">Revisar</button></td>
                          </tr>
                          
                      </tbody>
                  </table>
                      </div>
              </div>  
          </div>
              </div>
              
      </div>
  </body>
</html>

