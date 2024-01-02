<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>
</head>
<body>
<h2 class="bg-danger text-white text-center" >Employee Registration</h2>
<form action="<%= request.getContextPath() %>/register" method="post">
	<table class="table table-hover">
		<tr>
			<td>Employee Name</td>
			<td> <input type="text" name="ename"> </td>
		</tr>
		<tr>
			<td>Employee Phone</td>
			<td><input type="text" name="ephone" ></td>
		</tr>
		<tr>
			<td>Employee Email</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Register"></td>
			<td><input type="reset" value="Cancel"></td>
		</tr>
	</table>
</form>
</body>
</html>