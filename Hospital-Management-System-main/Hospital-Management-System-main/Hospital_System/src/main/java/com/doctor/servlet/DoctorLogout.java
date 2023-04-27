package com.doctor.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/doctorLogout")
public class DoctorLogout extends HttpServlet {

	
	private static final long serialVersionUID = -895224176108100492L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session =req.getSession();
		session.removeAttribute("doctobj");
		session.setAttribute("succMsg","Doctor Logout Sucessfully");
		
		resp.sendRedirect("doctor_login.jsp");
		
	}
	
	

}
