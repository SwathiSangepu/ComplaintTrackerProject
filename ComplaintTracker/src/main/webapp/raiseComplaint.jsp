<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complaints Submission Page</title>
</head>
<body>
<h3>Welcome <%= session.getAttribute("email") %> to Complaints Submission page</h3>
<h5>Submit your complaint</h5>
<form action="raiseComplaint" method="post">
<input type="text" name="userName" placeholder="Enter Name"><br><br>
<input type="email" name="email" placeholder="Enter email" value="<%= session.getAttribute("email") %>"><br><br>
<input type="number" name="flatNo" placeholder="Enter Flat Number"><br><br>
<input type="text" name="complaintStatus" placeholder="Enter status" value="New"><br><br>
<input type="textarea" name="complaint" placeholder="Enter description"><br><br>
<input type="text" name="phoneNumber" placeholder="Enter mobile number"><br><br>
<input type="submit" value="Submit">
</form>
<h3><a href="userDashboard.jsp">Back to Home Page</a></h3>
</body>
</html>