

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class list
 */
@WebServlet("/list")
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public list() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String lang = request.getParameter("lang");
		Map<String, ArrayList<String>> map = null;
		//File Handler
		try {
			map = FileHandler.loadFileData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		response.getWriter().append(map.get(1+"").get(1).toString());
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		if(lang.equals("Russian")){
			for(int i = 1 ;i <= 11;i++){
				String temp = map.get(i+"").get(1).toString();
				String engtemp = map.get(i+"").get(0).toString();
				list.add(temp);
				list2.add(engtemp);
			}//end loop
		}else{
			for(int i = 1 ;i <= 11;i++){
				String temp = map.get(i+"").get(2).toString();
				String engtemp = map.get(i+"").get(0).toString();
				list.add(temp);
				list2.add(engtemp);
			}//end loop
		}//end if
		int size = list.size();
		response.sendRedirect("/myapp/display.jsp?wone=" + list.get(0).toString() + "&wtwo=" + list.get(1).toString()
				+ "&wthree=" + list.get(2).toString() + "&wfour=" + list.get(3).toString()
				+ "&wfive=" + list.get(4).toString() + "&wsix=" + list.get(5).toString()
				+ "&wseven=" + list.get(6).toString() + "&weight=" + list.get(7).toString()
				+ "&wnine=" + list.get(8).toString() + "&wten=" + list.get(9).toString()
				+ "&one=" + list2.get(0).toString() + "&two=" + list2.get(1).toString()
				+ "&three=" + list2.get(2).toString() + "&four=" + list2.get(3).toString()
				+ "&five=" + list2.get(4).toString() + "&six=" + list2.get(5).toString()
				+ "&seven=" + list2.get(6).toString() + "&eight=" + list2.get(7).toString()
				+ "&nine=" + list2.get(8).toString() + "&ten=" + list2.get(9).toString() + "&count=" + size
				);
		//response.getWriter().append(list[1]).append(request.getContextPath());
		//response.getWriter().append(list);
//		response.getWriter().append("Append Test 2 ");
//		response.getWriter().append("Append Test 3 ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
