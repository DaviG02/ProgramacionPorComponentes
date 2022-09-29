<%-- 
    Document   : index
    Created on : 7/09/2022, 1:14:16 p. m.
    Author     : administradorPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina 1</title>
    </head>
    <body style="background-color:cadetblue;">
        <center><h1><font color=#000080>HOLA GENTE </font></h1></center>
        <a href="Control">Verificar servelet objeto Response</a>
        <form action="Control" method="get">
            <B><label>Nombres:</label></B>
            <input type="text" name="txt_Nombre" required/>
            <B><label>Apellidos:</label></B>
            <input type="text" name="txt_Apellidos" required/>
            <input type="submit" name="btn_registrar" value="registrar "/>
            <h3><B><label>Por:David Esteban Gomez Bohórquez</label></B></h3>
        </form>
    </body>
</html>
