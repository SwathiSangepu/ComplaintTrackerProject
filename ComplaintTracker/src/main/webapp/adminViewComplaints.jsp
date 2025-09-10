<%@ page language="java"   import="java.util.*, com.model.Complaints, com.dao.ComplaintsDao" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% ComplaintsDao cd=new ComplaintsDao();
 List<Complaints> userComplaints= cd.getAllComplaints();
 %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Admin View Complaints</title>
</head>
<body>

<h3>Welcome to complaints page <%=session.getAttribute("email") %></h3>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Flat No</th>
<th>Status</th>
<th>Complaint</th>
<th>Phone Number</th>
<th>Update</th>
</tr>
 <% for (Complaints c:userComplaints){ %>  

<tr>
<td><%= c.getComplaintId() %></td>
<td><%= c.getUserName() %></td>
<td><%= c.getEmail() %></td>
<td><%= c.getFlatNo() %></td>
<td><%= c.getComplaintStatus() %></td>
<td><%= c.getComplaint() %></td>
<td><%= c.getPhoneNumber() %></td>
<td><a href="adminUpdateComplaint.jsp?complaintId=<%= c.getComplaintId() %>">Update</a></td>
</tr>
<%}%>
</table>

<a href="adminDashboard.jsp">Back to Dashboard</a>
</body>
</html>
