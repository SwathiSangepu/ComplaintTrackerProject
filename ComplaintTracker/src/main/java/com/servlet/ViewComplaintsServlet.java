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

@WebServlet("/viewComplaints")
public class ViewComplaintsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
//		ComplaintsDao cd=new ComplaintsDao();
//		List<Complaints> userComplaints= cd.getUserComplaints((String) session.getAttribute("email"));
//		req.setAttribute("complaintslist", userComplaints);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("viewComplaints.jsp");
		requestDispatcher.forward(req, resp);
		
	}
		
}
