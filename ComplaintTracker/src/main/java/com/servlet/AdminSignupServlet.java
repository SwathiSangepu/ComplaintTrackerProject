package com.servlet;

import java.io.IOException;

import com.dao.AdminDao;
import com.model.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/adminSignup")
public class AdminSignupServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		Admin a=new Admin(email,password);
		
		AdminDao ad=new AdminDao();
		ad.saveAdmin(a);
		
		resp.sendRedirect("adminLogin.jsp");
		
	}
}
