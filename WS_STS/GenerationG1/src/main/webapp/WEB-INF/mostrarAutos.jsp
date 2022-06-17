<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Auto</title>
</head>
<body>
<div>
<c:if test="${msgError!= null}">
<c:out value="${msgError}"></c:out>
</c:if>
<!-- recorriendo el arreglo de autos -->
  <c:forEach> var="auto" items="${autosCapturados}">
  <p>${auto.marca} ${auto.modelo} ${auto.velocidad} ${auto.color}</p>
  <br>
  </c:forEach>

</div>
</body>
</html>
