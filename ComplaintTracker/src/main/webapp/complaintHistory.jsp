<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.dao.ComplaintsDao, java.util.*, com.model.Complaints" %>
    <% ComplaintsDao cd=new ComplaintsDao();
<<<<<<< HEAD
    	List<Complaints> list=cd.getUserComplaintsHistory();
=======
    	List<Complaints> list=cd.getUserComplaintsHistory((String) session.getAttribute("email"));
>>>>>>> 8a58fe5 (added changes)
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complaints History Page</title>
</head>
<body>
<h3>Welcome to complaints page <%=session.getAttribute("email") %></h3>
<p> Previously Raised Complaints</p>
<%if (list != null && !list.isEmpty()) { %>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Flat No</th>
<th>Status</th>
<th>Complaint</th>
<th>Phone Number</th>

</tr>
<% 
	for(Complaints c: list) {
%>
<tr>
<td><%= c.getComplaintId() %></td>
<td><%= c.getUserName() %></td>
<td><%= c.getEmail() %></td>
<td><%= c.getFlatNo() %></td>
<td><%= c.getComplaintStatus() %></td>
<td><%= c.getComplaint() %></td>
<td><%= c.getPhoneNumber() %></td>
</tr>
<%}%>
</table>
<%} else {
    %>
   <p>No Complaints found</p>
   <h3> Want to raise a complaint <a href="raiseComplaint.jsp">New Complaint</a></h3>
    <% } %>
<a href="userDashboard.jsp">Back to Dashboard</a>
</body>
</html>