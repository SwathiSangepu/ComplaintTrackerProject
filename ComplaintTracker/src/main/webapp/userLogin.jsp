<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login Page</title>
</head>
<body>
<h3> Welcome To User Login Page</h3>
<form action="userLogin" method="post">
<label for="email">Email</label>
<input type="text" name="email" placeholder="Enter Email"><br><br>
<label for="password">Password</label>
<input type="password" name="password" placeholder="Enter Password"><br><br>
<input type="submit" value="Login">
<p>Don't have an account ? <a href="userSignup.jsp">SignUp</a></p>
</form>
</body>
</html>