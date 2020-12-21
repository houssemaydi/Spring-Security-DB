<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
<sec:authorize access="isAuthenticated()">
 Bienvenue <sec:authentication property="name"/>
 (<a href="<c:url value="/logout" />">Logout</a>)
</sec:authorize>
<h2>Liste des Livres</h2>
<table border="1">
<tr><th>ID</th><th>Titre</th><th>Quantité</th></tr>
<c:forEach items="${liste}" var="c">
 <tr>
 <td>${c.id }</td>
 <td>${c.titre }</td>
 <td>${c.quantite }</td>
 <sec:authorize access="hasRole('ADMIN')">
 <td><a href="deleteLivre/${c.id}">delete</a></td>
 </sec:authorize>
 </tr>
</c:forEach>
</table>
<sec:authorize access="hasRole('ADMIN')">
<p><a href="addLivre">Ajouter un Livre</a></p>
</sec:authorize>
</body>
</html> 