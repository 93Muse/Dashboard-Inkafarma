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

                            <script type="text/javascript">
                                var canvas = document.getElementById('myChart');
                                var data = {
                                    labels: ["Servidor", "Ordenadores", "Impresora", "Scanner", "POS"],
                                    datasets: [
                                        {
                                            label: "Reporte de equipos",
                                            backgroundColor: "rgba(255,99,132,0.2)",
                                            borderColor: "rgba(255,99,132,1)",
                                            borderWidth: 2,
                                            hoverBackgroundColor: "rgba(255,99,132,0.4)",
                                            hoverBorderColor: "rgba(255,99,132,1)",
                                            data: [65, 59, 30, 81, 56]
                                        }
                                    ]
                                };
                                var option = {
                                    animation: {
                                        duration: 5000
                                    }

                                };

                                var myBarChart = Chart.Bar(canvas, {
                                    data: data,
                                    options: option
                                });
                            </script>                   
                        </div>
                    </div>
                    <br><br>
                    <script src="js/main.js"></script>                 
                </div>
            </div>
        </div>
    </body>
</html>

