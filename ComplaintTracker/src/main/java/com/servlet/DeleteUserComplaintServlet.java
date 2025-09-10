package com.servlet;

import java.io.IOException;

import com.dao.ComplaintsDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/deleteComplaint")
public class DeleteUserComplaintServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("complaintId"));
		ComplaintsDao cd=new ComplaintsDao();
		cd.deleteComplaint(id);
		
		resp.sendRedirect("viewComplaints.jsp");
	}
}
