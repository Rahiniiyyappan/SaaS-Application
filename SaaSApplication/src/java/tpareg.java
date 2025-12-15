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
public class tpareg extends HttpServlet {

 Connection cn;
    Statement st;
    ResultSet rs;
    
    public void init(ServletConfig config)throws ServletException
	{
	super.init(config);
		try
		{
                Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud","root","");
		 st=cn.createStatement();
                ResultSet rs;
               st.executeUpdate(" CREATE TABLE tpareg(una varchar(20) NOT NULL, psw varchar(20) NOT NULL)");
               cn.close();
		}catch(Exception e){}                                                                                                             
	}

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
              res.setContentType("html/text");
        PrintWriter pw=res.getWriter();
        String d1=req.getParameter("T1");
        String d2=req.getParameter("T2");

try{
    String sql="insert into tpareg values('"+d1+"','"+d2+"')";
    st.executeUpdate(sql);
    
   }catch(Exception e){}
}
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
