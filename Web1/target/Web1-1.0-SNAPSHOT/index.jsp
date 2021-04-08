<%-- 
    Document   : index
    Created on : 16 nov. 2020, 9:13:56
    Author     : daw1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        String nombre = "Víctor";
        int edad = 18;
        
        String validez = "Hola "+ nombre +" de "+ edad +" años";
        %>
    </body>
</html>
