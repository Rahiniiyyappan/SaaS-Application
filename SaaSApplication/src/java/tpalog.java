
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class tpalog extends HttpServlet {
    Connection cn;
    Statement st;
    ResultSet rs;
    String una,psw;
    public void init(ServletConfig config)throws ServletException
	{
	super.init(config);
		try
		{
                Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud","root","");
		 st=cn.createStatement();
                ResultSet rs;
		}catch(Exception e){}                                                                                                             
	}

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
   res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String d1=req.getParameter("T1");
    
try{
    String sql="select *from tpareg where una='"+d1+"'";
     rs=st.executeQuery(sql);
     while(rs.next())
     {
      una=rs.getString(1);
     }
     
}catch(Exception e){}
if(d1.equals(una))
{
    res.sendRedirect("http://localhost:8080/cloud/newaccount.html");



}
else
{
 res.sendRedirect("http://localhost:8080/cloud/invalid.html"); 
}
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

