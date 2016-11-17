import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class Login
 */
@WebServlet(urlPatterns = "/login", initParams = {
		@WebInitParam(name = "messagePath", value = "/WEB-INF/config/eng_messages") })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

//		String path = config.getInitParameter("messagePath");
//		try {
//			if (config.getServletContext().getResource(path)==null){
//				throw new RuntimeException("Contact Customer Support: message file is misssing");
//			}
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
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
		FileHandler fh = new FileHandler();
		ArrayList<String[]> users = new ArrayList<String[]>();
		try{
		//fh.loadFileData("users.txt");
		
		users = fh.loadFileData("users.txt");
		}catch(Exception E){
        	System.out.println("ERROR");
        }
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		

		for(int i = 0; i <= users.size();i++){
			//System.out.println(i);
			try{
			if(userName.equals(users.get(i)[1])&& password.equals(users.get(i)[2])){
				request.setAttribute("user", userName);
				request.getRequestDispatcher("/jsps/welcome.jsp").forward(request, response);
			}
			}catch(Exception E){}
			
		}//end while
		request.setAttribute("color", "red");
		request.setAttribute("message", "Please, Enter Missing Info");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		

	}
}
