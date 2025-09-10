package com.servlet;

import java.io.IOException;

import com.dao.AdminDao;
import com.model.Admin;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/adminLogin")
public class AdminLoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		Admin a=new Admin(email,password);
		
		AdminDao ad=new AdminDao();
		boolean isValid=ad.validateAdmin(a);
		
		if(isValid) {
			HttpSession session = req.getSession();
			session.setAttribute("email",a.getEmail());
			resp.sendRedirect("adminDashboard.jsp");
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("adminSignup.jsp");
			requestDispatcher.forward(req, resp);
		}
		
		
	}

}
