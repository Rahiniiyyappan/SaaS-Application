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

public class downer extends HttpServlet {

    Connection cn;
    Statement st;
    ResultSet rs;
    String serv1,serv2,serv3,did,regd,ctx;
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
            throws ServletException, IOException { }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("html/text");
        PrintWriter pw=res.getWriter();
         String d1=req.getParameter("T1");
        String d2=req.getParameter("T2");
        String d3=req.getParameter("S1");
        String d4=req.getParameter("D1");  

        try{
        if("server1".equals(d4))
        {
        String sql="insert into serv1 values('"+d1+"','"+d2+"','"+d3+"','"+d4+"')";
        st.executeUpdate(sql);
        }
       else 
        if("server2".equals(d4))
        {   
        String sql="insert into serv2  values('"+d1+"','"+d2+"','"+d3+"','"+d4+"')";
        
         st.executeUpdate(sql);
                }      
       else{  
        String sql="insert into serv3 values('"+d1+"','"+d2+"','"+d3+"','"+d4+"')";  
    st.executeUpdate(sql);
           }
        } catch(Exception e2){}
  }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
