<%--
  Created by IntelliJ IDEA.
  User: main-pc
  Date: 12/12/2024
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Datos del cliente</title>
</head>
<body>
    <form action="SvUsuarios" method="POST">
        <h1>Datos del usuario</h1>
        <p><label>DNI: </label><input type="text" name="dni"></p>
        <p><label>Nombre: </label><input type="text" name="nombre"></p>
        <p><label>Apellido: </label><input type="text" name="apellido"></p>
        <p><label>teléfono: </label><input type="text" name="telefono"></p>
        <button type="submit">Enviar</button>
    </form>
    <h1>Ver lista de usuarios</h1>
    <p>Para ver los datos de los usuarios cargados haga click en el siguiente botón</p>
    <form action="SvUsuarios" method="GET">
        <button type="submit">Mostrar usuarios</button>
    </form>
</body>
</html>
