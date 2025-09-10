<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login Page</title>
</head>
<body>
<h3> Welcome To Admin Login Page</h3>
<form action="adminLogin" method="post">
<label for="email">Email</label>
<input type="text" name="email" placeholder="Enter Email"><br><br>
<label for="password">Password</label>
<input type="password" name="password" placeholder="Enter Password"><br><br>
<input type="submit" value="Login">
<p>Don't have an account ? <a href="adminSignup.jsp">SignUp</a></p>
</form>
</body>
</html>