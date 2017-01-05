<%-- 
    Document   : index
    Created on : 03/01/2017, 04:38:25 PM
    Author     : wpm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="WEB-INF/jspf/jscss.jspf" %>
        <link rel="stylesheet" href="css/estilos.css"/>
        <title>Inkafarma - Dashboard</title>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-2 sidebar">
                    <img src="img/perfil.png" class="img-circle" alt="Responsive image" id="imagen">
                    <h3 class="text-center nombre">Wilfredo Roel</h3>
                    <h4 class="text-center apellidos">Pedroso Melgarejo</h4>
                    <br>
                    <ul class="botones">
                        <a href="#"><li class="activado"><i class="icono izquierda fa fa-home"></i>Inicio</li></a>
                        <br>
                        <a><li><i class="icono izquierda fa fa-arrow-up"></i>Records<i class="icono derecha fa fa-chevron-down"></i></li></a>
                        <ul>
                            <a href="#"><li>Record Semanal</li></a>
                            <a href="#"><li>Record Mensual</li></a>
                        </ul>
                        <br>
                        <a><li><i class="icono izquierda fa fa-bar-chart"></i>Balances<i class="icono derecha fa fa-chevron-down"></i></li></a>
                        <ul>
                            <a href="#"><li>Tickets Top</li></a>
                            <a href="#"><li>Tickets Reportados</li></a>
                        </ul>
                        <br>
                        <a><li><i class="icono izquierda fa fa-crosshairs"></i>Dirección<i class="icono derecha fa fa-chevron-down"></i></li></a>
                        <ul>
                            <a href="#"><li>Incidentes Top</li></a>
                            <a href="#"><li>Requerimientos Top</li></a>
                            <a href="#"><li>Inc. Top fuera del SLA</li></a>
                            <a href="#"><li>Req. Top fuera del SLA</li></a>
                        </ul>
                        <br>
                    </ul>
                </div>
                <div class="col-md-10 col-md-offset-2 main">
                    <div class="row encabezado">
                        <img src="img/inkafarmaheader.png">   
                    </div>

                    <div class="row">
                        <div class="col-md-8 col-md-offset-3">
                            <canvas id="myChart" width="400" height="200"></canvas>
                            <script language="Javascript" type="text/javascript" src="js/linechart.js"></script>
                        </div>
                    </div>
                    <br><br>
                    <script src="js/main.js"></script>

                    <!--
                    <div class="table-responsive">
                        <table class="table table-bordered">
                            <thead>
                                <tr>
                                    <th>Contenido</th>
                                    <th>Contenido</th>
                                    <th>Contenido</th>
                                    <th>Contenido</th>
                                    <th>Contenido</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                                <tr>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                    <td>Contenido</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                    -->
                </div>
            </div>
        </div>
    </body>
</html>

<!--
        <div class="contenedor-menu">         
            <ul class="menu">
                <li><a href="index.jsp"><i class="icono izquierda fa fa-home"></i>Inicio</a></li>
                <li><a href="#"><i class="icono izquierda fa fa-arrow-up"></i>Records<i class="icono derecha fa fa-chevron-down"></i></a>
                    <ul>
                        <li><a href="linechart.jsp">Record Semanal</a></li>
                        <li><a href="#">Record Mensual</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icono izquierda fa fa-bar-chart"></i>Balances<i class="icono derecha fa fa-chevron-down"></i></a>
                    <ul>
                        <li><a href="#">Tickets Top</a></li>
                        <li><a href="#">Reportes de Uso</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icono izquierda fa fa-crosshairs" aria-hidden="true"></i>Auditoría<i class="icono derecha fa fa-chevron-down"></i></a>
                    <ul>
                        <li><a href="#">Tickets Atendidos Fuera del SLA</a></li>
                        <li><a href="#">Incidentes Top</a></li>
                        <li><a href="#">Requerimientos Top</a></li>
                        <li><a href="#">Locales Top</a></li>
                        <li><a href="#">Tickets Críticos Atendidos</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icono izquierda fa fa-envelope"></i>Contáctanos</a></li>
            </ul>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-md-8 col-md-offset-3">
                    <canvas id="myChart" width="400" height="200"></canvas>
                    <script language="Javascript" type="text/javascript" src="js/test.js"></script>
                </div>
            </div>
        </div>
        <br><br>
        <script src="js/main.js"></script>
-->