<%@ page contentType="text/html;charset=" language="java" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF=>

<title>Autos</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"

		
</head>
<body>
<div class="container">
<table class="table">
<thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Marca</th>
      <th scope="col">Modelo</th>
      <th scope="col">Color</th>
      <th scope="col">Velocidad</th>
    </tr>
  </thead>
  <tbody>
 <c:forEach var="auto" items"$(autosCapturados)">
 <c:forEach 
    <tr>
      <th scope="row">${auto.id}</th>
      <td>${auto.marca}</td>
      <td>${auto.modelo}</td>
      <td>${auto.color}</td>
      <td>${auto.velocidad}</td>
    </tr>
    </c:forEach>
    
  </tbody>
</table>
</div> 
<script
src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script> 
</body>
</html>
