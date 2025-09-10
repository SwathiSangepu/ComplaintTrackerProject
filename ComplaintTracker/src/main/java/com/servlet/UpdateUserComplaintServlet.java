package com.servlet;

import java.io.IOException;

import com.dao.ComplaintsDao;
import com.model.Complaints;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/updateComplaint")
public class UpdateUserComplaintServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("complaintId");
		int complaintId=Integer.parseInt(id);
		String name=req.getParameter("userName");
		int num=Integer.parseInt(req.getParameter("flatNo"));
		String complaint=req.getParameter("complaint");
		String mobileNum=req.getParameter("phoneNumber");
		Complaints c=new Complaints(complaintId,name,num,complaint,mobileNum);
		
		ComplaintsDao cd=new ComplaintsDao();
		cd.updateComplaint(c);
		
	
		resp.sendRedirect("viewComplaints");
	}
}
