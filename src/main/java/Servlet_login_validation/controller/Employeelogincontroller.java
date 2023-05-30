package Servlet_login_validation.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Servlet_login_validation.dao.Employeedao;
import Servlet_login_validation.dto.Employeedta;

@WebServlet("/login")
public class Employeelogincontroller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		int password=Integer.parseInt(pwd);
		
		Employeedao employeedao=new Employeedao();
		 Employeedta employeedta=employeedao.login(email);
		 if(employeedta!=null){
			 if(employeedta.getPassword()==password){
				 resp.getWriter().print("<h1>Welcome to home pages</h1>");
				 
			 }
			 else{
				 resp.getWriter().print("<h1> enter proper password </h1>");
				 RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
				 dispatcher.include(req, resp);
				 
				 
			 }
		 }
		 else{
			 resp.getWriter().print("<h1> account not found , please signup </h1><a href='Signup.html'>click on sigup</a>");
		 }
		
		
	}

}
