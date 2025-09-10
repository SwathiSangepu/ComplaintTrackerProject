<%@ page language="java" import="java.util.*, com.model.Complaints, com.dao.ComplaintsDao" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% int id=Integer.parseInt(request.getParameter("complaintId"));
    ComplaintsDao cd=new ComplaintsDao();
	Complaints c= cd.getComplaint(id); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Update Complaint page</title>
</head>
<body>

<form action="update" method="post">
<input type="hidden" name="complaintId" value="<%= c.getComplaintId()%>"><br><br>
<input type="text" name="userName" value="<%= c.getComplaint()%> "><br><br>
<label>Status</label>
<select name="complaintstatus"  value="<%= c.getComplaintStatus() %>">
<option value="<%= c.getComplaintStatus() %>"> <%= c.getComplaintStatus() %>	</option>
<option value="In progress">In Progress</option>
<option value="Resolved">Resolved</option>
</select>
<input type="submit" value="Update">
</form>
</body>
</html>