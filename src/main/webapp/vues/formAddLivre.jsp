<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Saisie d'un Livre</h3>
	<form:form method="post" action="saveLivre" modelAttribute="lv">
		<p>
			Titre
			<form:input path="titre" />
		</p>
		<p>
			Quantite
			<form:input path="quantite" />
		</p>
		<br>
		<input type="submit" value="Enregistrer">
	</form:form>
</body>
</html>
</html>