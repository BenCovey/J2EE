

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class numbers
 */
@WebServlet("/numbers")
public class numbers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public numbers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("I am alive");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("I am dead");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String Start = request.getParameter("start");
		String type = request.getParameter("sort");
		int intStart = 0;
		if(type == null){
			type = "asc";
		}
		//Check for blank values
		
		if (Start != null ){
	        //Parse Number to int
	        intStart = Integer.parseInt(Start);
	   
			if(type.equals("desc")){
				ArrayList<String> DescList = new ArrayList<String>();
				for(int i = intStart;i >= 0; i--){
					DescList.add(i + "");
					System.out.println(i);
					

			        
				}//end for
				response.getWriter().write(DescList + "");
			}//end if
			if (type.equals("asc")){
				ArrayList<String> AscList = new ArrayList<String>();
				for(int i = 0; i <= intStart; i++){
					AscList.add(i+ "");
			        System.out.println(i);
				}//end for
				response.getWriter().write(AscList + "");
			}//end if
			System.out.println("END OF PROGRAM-");
		}//end if
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}


}
