package ca.alexcochrane.j2ee.tutorial11;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.alexcochrane.j2ee.tutorial11.model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet(urlPatterns = {"/Login","/login"})

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int[] a = new int[3];
		request.setAttribute("array", a);
		request.setAttribute("a", "red");
		User user = new User(1,17,"John Stanley");
		request.setAttribute("user", user);
		Map<String,Integer> phoneBook = new HashMap<>();
		phoneBook.put("Jenny", 8675309);
		request.setAttribute("phonebook", phoneBook);
		request.getSession().setAttribute("a", "yellow");
		throw new RuntimeException("WITHHELD FOR LEGAL REASONS");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
