<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro</title>
</head>
<body>
<div>
<!-- pasar informacion desde la vista a una url(action) -->
<!-- method get es por default, los párametros se ven en la ruta-->
<!--  method post, los parametros no se ven, van ocultos -->
<form action="" method="Post">

<label for="nombre"> Nombre: </label>
<input type="text" id="nombre" name="nombre"> 
<br>
<label for="apellido"> Apellido: </label>
<input type="text" id="apellido" name="Apellido"> 
<br>
<label for="edad"> Edad: </label>
<input type="number" id="edad" name="edad"> 
<br>
<!-- submit para el envio de información -->
<input type="Submit" value="Registrar"> <input type="button" value="enviar">

</form>

</div>
</body>
</html>
