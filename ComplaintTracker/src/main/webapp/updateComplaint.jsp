<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*, com.dao.ComplaintsDao, com.model.Complaints" %>
    <% int id=Integer.parseInt(request.getParameter("complaintId"));
    ComplaintsDao cd=new ComplaintsDao();
	Complaints c= cd.getComplaint(id); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Complaints Page</title>
</head>
<body>
<h3>Update Your Complaint</h3>
<form action="updateComplaint" method="post">
<input type="hidden" name="complaintId" value="<%= id %>">
<input type="text" name="userName" value="<%= c.getUserName()%>"><br><br>
<input type="number" name="flatNo" value="<%= c.getFlatNo() %>"><br><br>
<input type="text" name="complaint" value="<%= c.getComplaint() %>"><br><br>
<input type="text" name="phoneNumber" value="<%= c.getPhoneNumber() %>"><br><br>
<input type="submit" value="Update">
</form>
</body>
</html>