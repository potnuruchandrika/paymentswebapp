package Pymentapp.com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phonenumber=request.getParameter("phonenumber");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String createpassword=request.getParameter("createpassword");
		String email=request.getParameter("email");
		user u= new user();
		u.setPhoneNumber(phonenumber);
		u.setCreatePassword(createpassword);
		u.setFirstName(firstname);
		u.setLastname(lastname);
		u.setEmail(email);
		PaymentappDAO pd = new PaymentappDAO();
		pd.insert(u);
		
		response.getWriter().write("Registered");
		response.setContentType("text/html");
		RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
		rd.include(request, response);
		
		HttpSession hs = request.getSession();
		hs.setAttribute("name",firstname);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
