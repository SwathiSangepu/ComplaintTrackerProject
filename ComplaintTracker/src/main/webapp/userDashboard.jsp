<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Dashboard</title>
</head>
<body>
<h3>Welcome <%= session.getAttribute("email") %></h3><br>
<a href="raiseComplaint.jsp">Raise Complaint</a><br><br>
<a href="viewComplaints.jsp">View Complaint</a><br><br>
<a href="complaintHistory.jsp">Complaint History</a><br><br>
<a href="index.html">LogOut</a>
</body>

</html>