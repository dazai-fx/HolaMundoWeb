<%@ page import="org.iesvdm.holamundoweb.logica.Usuario" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: main-pc
  Date: 13/12/2024
  Time: 7:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuarios</title>
</head>
<body>
  <h1>Lista de usuarios registrados</h1>
  <%

    // traemos las listas desde el atributo de la sessión que hemos enviado
    List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");

    int contador=1;
    for (Usuario usu: listaUsuarios){
  %>
  <p><b>Usuario Nº</b><%= contador %> </p>
  <p>Dni: <%= usu.getDni() %></p>
  <p>Nombre: <%= usu.getNombre() %></p>
  <p>Apellido: <%= usu.getApellido() %></p>
  <p>Telefono: <%= usu.getTelefono() %></p>
  <p>-------------------------------------------</p>
  <% contador++; } %>
</body>
</html>
