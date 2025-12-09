/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author rahin
 */
public class newacc extends HttpServlet {

    Connection cn;
    Statement st;
    ResultSet rs;
    public void init(ServletConfig config)throws ServletException
	{
	super.init(config);
		try
		{
                Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/accounts","root","");
		 st=cn.createStatement();
                ResultSet rs;
		}catch(Exception e){}                                                                                                             
	}

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }

 
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
       
       res.setContentType("text/html");
PrintWriter pw=res.getWriter();
int d1=Integer.parseInt(req.getParameter("T1"));
String d2=req.getParameter("T2");
String d3=req.getParameter("T3");
String d4=req.getParameter("T4");
String d5=req.getParameter("T5");
String d6=req.getParameter("T6");
String d7=req.getParameter("T7");
String d8=req.getParameter("T8");
String d9=req.getParameter("T9");
String d10=req.getParameter("T10");
pw.println("<html><body bgcolor=green><center><h1>the details</h1>");
pw.println("<table border=3 cellpadding=10 cellspacing=10><tr><th>Account no</th><th>Account Holder name</th><th>Address Field1</th><th>Address Field2</th><th>Account Type</th><th>Reference</th><th>Opening Date</th><th>Opening Account</th><th>Transaction</th>");
pw.println("<th>Current Balance</th></tr><tr><td>"+d1+"</td><td>"+d2+"</td><td>"+d3+"</td><td>"+d4+"</td><td>"+d5+"</td><td>"+d6+"</td>");
pw.println("<td>"+d7+"</td><td>"+d8+"</td><td>"+d9+"</td><td>"+d10+"</td></tr></html>");
try{
    String sql="insert into newaccount values("+d1+",'"+d2+"','"+d3+"','"+d4+"','"+d5+"','"+d6+"','"+d7+"','"+d8+"','"+d9+"','"+d10+"')";
    st.executeUpdate(sql);
}catch(Exception e){}
try{
      st.executeUpdate("update newaccount set tra='"+d9+"' where ano="+d1);
      
}catch(Exception e4){}
//res.sendRedirect("http://localhost:8080/accounts/");
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
