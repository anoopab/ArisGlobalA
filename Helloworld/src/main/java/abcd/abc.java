package abcd;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class abc extends HttpServlet

{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String x = req.getParameter("num1");
		String y = req.getParameter("num2");
		req.setAttribute("num1", x);
		req.setAttribute("num2", y);
		RequestDispatcher r = req.getRequestDispatcher("output.jsp");
		r.forward(req, resp);
		
	}

}