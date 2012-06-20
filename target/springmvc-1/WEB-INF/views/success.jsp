<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Login - success</title>
</head>
<body>
<form:form modelAttribute="loginBean">
	<fieldset>
		<legend>Login Details</legend>
		<table>
			<tr>
				<td> User Id :</td>
				<td> ${userId}</td>
			</tr>
			<tr>
				<td> Password :</td>
				<td> ${password}</td>
			</tr>
			<tr>
				<td> Database :</td>
				<td> ${database}</td>
			</tr>
			<tr>
				<td> Server :</td>
				<td> ${server}</td>
			</tr>
			<tr>
				<td> Connection :</td>
				<td> ${connection}</td>
			</tr>
		</table>
	</fieldset>
</form:form>
</body>
</html>
