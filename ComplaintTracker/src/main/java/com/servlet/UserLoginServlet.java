package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.ResidentDao;
import com.model.Resident;
import com.utils.Constants;
import com.utils.DBConnection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/userLogin")
public class UserLoginServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");	
		Resident r=new Resident(email,password);
		ResidentDao rd=new ResidentDao();
		boolean isValid=rd.validateResident(r);
		if(isValid) {
			HttpSession session=req.getSession();
			session.setAttribute("email", r.getEmail());
			resp.sendRedirect("userDashboard.jsp");
		}
		else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("userSignup.jsp");
			requestDispatcher.forward(req, resp);
		}
		
	}
	

}
