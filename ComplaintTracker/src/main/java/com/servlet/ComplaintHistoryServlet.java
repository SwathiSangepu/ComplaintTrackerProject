package com.servlet;

import java.io.IOException;

import com.dao.ComplaintsDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/history")
public class ComplaintHistoryServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ComplaintsDao cd=new ComplaintsDao();
		cd.getUserComplaintsHistory();
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewComplaints");
		requestDispatcher.forward(req, resp);
		
	}
}
