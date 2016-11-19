<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="dao" class="dao.ClienteDao"></jsp:useBean>

	<ul>
		<c:forEach var="cliente" items="${ dao.listCliente() }">
			<li>${ cliente.nome }</li>
		</c:forEach>
	</ul>


</body>
</html>