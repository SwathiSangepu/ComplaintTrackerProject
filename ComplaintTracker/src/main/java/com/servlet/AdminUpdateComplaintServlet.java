package com.servlet;

import java.io.IOException;

import com.dao.AdminDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/update")
public class AdminUpdateComplaintServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("complaintId"));
		String status=req.getParameter("complaintstatus");
		
		AdminDao ad=new AdminDao();
		ad.updateComplaint(id,status);
		
		resp.sendRedirect("allComplaints");
	}
}
