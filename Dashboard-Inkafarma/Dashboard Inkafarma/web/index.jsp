<%-- 
    Document   : index
    Created on : 13/12/2016, 08:09:47 PM
    Author     : wpm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximun-scale=1.0, minumum-scale=1.0">
        <title>Inkafarma - Dashboard</title>
        <%@include file="WEB-INF/jspf/jscss.jspf" %>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/userHeader.jspf" %>
        <div class="contenedor-menu">
            <a href="#" class="btn-menu">Menú<i class="icono fa fa-bars"></i></a>
            <ul class="menu">
                <li><a href="#"><i class="icono izquierda fa fa-home"></i>Inicio</a></li>
                <li><a href="#"><i class="icono izquierda fa fa-star"></i>Productos<i class="icono derecha fa fa-chevron-down"></i></a>
                    <ul>
                        <li><a href="#">Item 1</a></li>
                        <li><a href="#">Item 2</a></li>
                        <li><a href="#">Item 3</a></li>
                        <li><a href="#">Item 4</a></li>
                    </ul>
                </li>
                <li><a href="#"><i class="icono izquierda fa fa-share-alt"></i>Redes Sociales<i class="icono derecha fa fa-chevron-down"></i></a>
                    <ul>
                        <li><a href="#">Item 1</a></li>
                        <li><a href="#">Item 2</a></li>
                        <li><a href="#">Item 3</a></li>
                        <li><a href="#">Item 4</a></li>
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
    </body>
</html>
