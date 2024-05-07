
package Pymentapp.com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		PaymentappDAO pd = new PaymentappDAO();
		if(pd.validlogin(username, password))
		{
			RequestDispatcher rd = request.getRequestDispatcher("/dashboard.jsp");
			rd.forward(request, response);
		}
		else
		{
			response.getWriter().write("invalid user");
			response.setContentType("");
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);
			
		}
	}
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
