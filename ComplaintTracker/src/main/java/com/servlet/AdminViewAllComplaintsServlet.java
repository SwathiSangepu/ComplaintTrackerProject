package com.servlet;

import java.io.IOException;
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

@WebServlet("/allComplaints")
public class AdminViewAllComplaintsServlet extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ComplaintsDao cd=new ComplaintsDao();
		List<Complaints> list = cd.getAllComplaints();
		
		
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminViewComplaints.jsp");
		requestDispatcher.forward(req, resp);
	}

}
