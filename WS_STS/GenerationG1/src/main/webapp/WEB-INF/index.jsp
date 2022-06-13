<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Diana Miranda</title>
</head>
<body>
<h1>Hola <c:out value="${nombre}" ></c:out><c:out value="${apellido}"></c:out></h1>
<p> <c:out value="${edad}" ></c:out> </p>
<p> <c:out value="${Universo}" ></c:out> </p>
<br> 
<p><c:out value="${usuario.nombre } ${usuario.apellido} ${usuario.getEdad()}" ></c:out></p>
</body>
</html>
