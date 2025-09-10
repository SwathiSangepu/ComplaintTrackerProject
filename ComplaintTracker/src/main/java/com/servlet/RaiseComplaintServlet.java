package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.dao.ComplaintsDao;
import com.model.Complaints;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/raiseComplaint")
public class RaiseComplaintServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("userName");
		String e=(String) req.getSession().getAttribute("email");
		int num=Integer.parseInt(req.getParameter("flatNo"));
		String status=req.getParameter("complaintStatus");
		String complaint=req.getParameter("complaint");
		String phoneNum=req.getParameter("phoneNumber");
		
		Complaints c=new Complaints(name,e,num,status,complaint,phoneNum);
		ComplaintsDao cd=new ComplaintsDao();
		boolean saved=cd.saveComplaint(c);
		if(saved) {
			resp.sendRedirect("viewComplaints");
		}
		else {
			resp.getWriter().println("Failed to submit");
		}
		
		
		
	}
}
