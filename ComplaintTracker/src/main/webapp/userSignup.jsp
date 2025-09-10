<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User SignUp</title>
</head>
<body>
<h3>Welcome to User SignUp page</h3>
<form action="userSignup" method="post">
<label for="email">Email</label>
<input type="text" name="email" placeholder="Enter Email"><br><br>
<label for="password">Password</label>
<input type="password" name="password" placeholder="Enter Password"><br><br>
<label for="password">Password</label>
<input type="password" placeholder="Confirm Password"><br><br>
<input type="submit" value="SignUp">
<p>Already have an account ? <a href="userLogin.jsp">Login</a></p>
</form>
</body>
</html>