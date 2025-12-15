import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.ServletConfig;
public class adlog extends HttpServlet {
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

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String d1=req.getParameter("T1");
String d2=req.getParameter("T2");    
try{
    String sql="select *from adreg where una='"+d1+"' and psw='"+d2+"'";
     rs=st.executeQuery(sql);
     while(rs.next())
     {
      una=rs.getString(1);
      psw=rs.getString(2);
     }   
}catch(Exception e){}
if(d1.equals(una)&& d2.equals(psw))
{
res.sendRedirect("http://localhost:8080/cloud/downer.html");

}
else
{
   res.sendRedirect("http://localhost:8080/cloud/invalid.html");
}
 }

}
