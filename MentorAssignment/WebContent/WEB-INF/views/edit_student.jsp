<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Student</title>
</head>
<body>

<div align="center">
	<h2>Edit Student</h2>
	<form:form action="save" method="POST" modelAttribute="student">
		<table border="0" cellpadding="5">
			 <tr>
			 	<td>Roll Number</td>
				<td>
					${student.rollno}
					<form:hidden path="rollno"/> 
				</td>
			</tr>
			<tr>
				<td>First Name: </td>
				<td><form:input path="fname"/></td>
			</tr>
			<tr>
				<td>Last Name: </td>
				<td><form:input path="lname"/></td>
			</tr>
			<tr>
				<td>E-mail: </td>
				<td><form:input path="email"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"/></td>
			</tr>
			<tr>
				<td><a href="studentlist"><button type="button">Cancel</button></a></td>
			</tr>
	</table>
	</form:form>
	
</div>
</body>
</html>