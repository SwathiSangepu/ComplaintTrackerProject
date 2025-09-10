package com.servlet;

import java.io.IOException;

import com.dao.ResidentDao;
import com.model.Resident;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/userSignup")
public class UserSignupServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		Resident r=new Resident(email,password);
		
		ResidentDao rd=new ResidentDao();
		rd.saveResident(r);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("userLogin.jsp");
		requestDispatcher.forward(req, resp);
	}

}
