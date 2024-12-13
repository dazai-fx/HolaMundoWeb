<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Date, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<% String hola = "Hola mundo"; %>
<h1><%= hola %></h1>
<a href="hello-servlet">Hello Servlet</a>
<%-- Comentarios --%>
<%! // se suele utilizar para declarar variables o métodos que se compartiran entre diferentes jsp asociados al mismo servlet %>
</body>
</html>