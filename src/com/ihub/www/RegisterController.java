package com.ihub.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterController extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//reading form data 
		String email=req.getParameter("email");
		
		String sphone=req.getParameter("phone");
		long phone=Long.parseLong(sphone);
		
		String name=req.getParameter("name");
		String addrs=req.getParameter("address");
		
		String sdate =req.getParameter("date");
		
		
		//converting string date to sql date.
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		java.util.Date udob=null;
		try {
			udob=sdf.parse(sdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long ms=udob.getTime();
		java.sql.Date dob=new java.sql.Date(ms);
		
		
		//set the data to bean object
		RegisterBean rb=new RegisterBean();
		rb.setEmail(email);
		rb.setPhone(phone);
		rb.setName(name);
		rb.setAddress(addrs);
		rb.setDate(dob);
		
		
		Connection con=null;
		PreparedStatement ps=null;
		String qry=null;
		int result=0;
		try
		{
			con=DBConnection.getConnection();
			
			//create a query
			qry="insert into registration values(?,?,?,?,?)";
			
			ps=con.prepareStatement(qry);
			
			//set the values
			ps.setString(1, rb.getEmail());
			ps.setLong(2, rb.getPhone());
			ps.setString(3, rb.getName());
			ps.setString(4, rb.getAddress());
			ps.setDate(5,(Date) rb.getDate());
			
			//execute
			result = ps.executeUpdate();
			if(result==0)
			{
				RequestDispatcher rd=req.getRequestDispatcher("error.jsp");
				rd.forward(req, res);
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
				rd.forward(req, res);
			}
			
			ps.close();
			con.close();
			
		}
		catch(Exception e)
		{
			pw.println(e);
		}
		pw.close();
	}
}










