<%-- 
    Document   : cabecera
    Created on : 06/01/2017, 12:18:55 AM
    Author     : Wilfredo
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            HttpSession s = request.getSession();
            
            ResultSet rs = null;
            
            if (s.getAttribute("sLista") != null) {
                rs = (ResultSet) s.getAttribute("sLista");
            }
         %>  
         
    </body>
</html>
