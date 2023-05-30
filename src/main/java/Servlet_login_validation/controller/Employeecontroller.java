package Servlet_login_validation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Servlet_login_validation.dao.Employeedao;
import Servlet_login_validation.dto.Employeedta;

@WebServlet("/signup")
public class Employeecontroller  extends HttpServlet{
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 String emailid=req.getParameter("emailid");
	 String name=req.getParameter("name");
	 String pwd=req.getParameter("pwd");
	  int password=Integer.parseInt(pwd);
	  
	  Employeedta dto=new Employeedta();
	  dto.setEmail(emailid);
	  dto.setName(name);
   dto.setPassword(password);	
   
   Employeedao dao=new Employeedao();
   dao.create(dto);
}
	
	
}
