

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Books
 */
@WebServlet("/cart")
public class Books extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public int books = 0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Books() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		books = 0;
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String sbooks = request.getParameter("books");
		int ibooks = 0;
		try{
		if(sbooks != "" || sbooks != " "){
			ibooks = Integer.parseInt(sbooks);
		
		}else{
			ibooks = 0;
		}
		}catch(Exception e){
			ibooks = 0;
		}
		books += ibooks;
		
		request.setAttribute("books", books);
		request.getRequestDispatcher("/").forward(request, response);
	}

	/**
	 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, int books) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String sbooks = request.getParameter("books");
		int ibooks = Integer.parseInt(sbooks);
		
		books += ibooks;
		
		request.setAttribute("books", books);
		request.getRequestDispatcher("/cart").forward(request, response);
		
	}

}
