package com.servlet;

import java.io.IOException;

import com.dao.ComplaintsDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
<<<<<<< HEAD
=======
import jakarta.servlet.http.HttpSession;
>>>>>>> 8a58fe5 (added changes)

@WebServlet("/history")
public class ComplaintHistoryServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ComplaintsDao cd=new ComplaintsDao();
<<<<<<< HEAD
		cd.getUserComplaintsHistory();
		
=======
		HttpSession session = req.getSession();
		cd.getUserComplaintsHistory((String) session.getAttribute("email"));
>>>>>>> 8a58fe5 (added changes)
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewComplaints");
		requestDispatcher.forward(req, resp);
		
	}
}
