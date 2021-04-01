<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

	<div align="center">
		<h1>List of Students</h1>
		<form method="GET" action="search">
			<%-- 
			<input type="text" name="keyword" /> 
			<input type="submit" value="Search" />
			--%>
		</form>
		<table  border="1" cellpadding="5">
			<tr>
				<th>Roll No.</th> 
				<th>First Name</th>
				<th>Last Name</th>
				<th>E-mail</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${listStudent}" var="student">
			<tr>
				<td>${student.rollno}</td>
				<td>${student.fname}</td>  
				<td>${student.lname}</td>
				<td>${student.email}</td>
				<td>
					<a href="edit?rollno=${student.rollno}">Edit</a>
					&nbsp; &nbsp; &nbsp;
					<a href="delete?rollno=${student.rollno}">Delete</a>
				</td>
			</tr>
			</c:forEach>
		</table>
		<br>
		<a href="new"><button type="button">New Student</button></a>
	</div>

</body>
</html>