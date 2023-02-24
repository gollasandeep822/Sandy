package com.ihub.www;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet 
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		//reading form data 
		String email=req.getParameter("email");
				
		String sphone=req.getParameter("phone");
		long phone=Long.parseLong(sphone);
		
		Connection con=null;
		PreparedStatement ps=null;
		String qry=null;
		ResultSet rs=null;
		int result=0;
		try
		{
			con=DBConnection.getConnection();
			qry="select count(*) from registration where email=? and phone=?";
			ps=con.prepareStatement(qry);
			
			//set the values
			ps.setString(1, email);
			ps.setLong(2, phone);
			
			//execute
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				result=rs.getInt(1);
			}
			if(result==0)
			{
				RequestDispatcher rd=req.getRequestDispatcher("loginError.jsp");
				rd.forward(req, res);
			}
			else
			{
				RequestDispatcher rd=req.getRequestDispatcher("loginSuccess.jsp");
				rd.forward(req, res);
			}
			
		}
		catch(Exception e)
		{
			pw.println(e);
		}
		pw.close();
	}
}










