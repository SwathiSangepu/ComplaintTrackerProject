<%@ page import="java.util.*, com.model.Complaints, com.dao.ComplaintsDao" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% ComplaintsDao cd=new ComplaintsDao();
	List<Complaints> userComplaints= cd.getUserComplaints((String) session.getAttribute("email")); %>
 
<%--  <% List<Complaints> userComplaints=(List<Complaints>) request.getAttribute("complaintslist"); %> --%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View User Complaints</title>
</head>
<body>
<h3>Welcome to complaints page <%=session.getAttribute("email") %></h3>
<%if (userComplaints != null && !userComplaints.isEmpty()) { %>
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
<th>Delete</th>
</tr>
<% 
	for(Complaints c: userComplaints) {
%>
<tr>
<td><%= c.getComplaintId() %></td>
<td><%= c.getUserName() %></td>
<td><%= c.getEmail() %></td>
<td><%= c.getFlatNo() %></td>
<td><%= c.getComplaintStatus() %></td>
<td><%= c.getComplaint() %></td>
<td><%= c.getPhoneNumber() %></td>
<td><a href="updateComplaint.jsp?complaintId=<%= c.getComplaintId()%>">Update</a></td>
<td><a href="deleteComplaint?complaintId=<%= c.getComplaintId()%>">Delete</a></td>
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