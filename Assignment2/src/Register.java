import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register", initParams = {
		@WebInitParam(name = "messagePath", value = "/WEB-INF/config/eng_messages") })
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}
	

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String Name = request.getParameter("Name");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if (userName != null && userName.trim().length() > 0 && password != null && password.trim().length() > 0 && Name != null && Name.trim().length() > 0) {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:/Users/benvc/Desktop/EclispeProjects/Assignment2/myapp/WEB-INF/users.txt", true)));
            //out.write(Name + "," + userName + "," + password + "\n" );
            //out.newLine();	
            out.println(Name + "," + userName + "," + password + "");
            out.close();
            request.setAttribute("user", userName);
			request.getRequestDispatcher("/jsps/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("color", "red");
			request.setAttribute("message", "Please, Enter Missing Info");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}

	}
}