

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class translate
 */
@WebServlet("/translate")
public class translate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public translate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String phrase = request.getParameter("phrase");
		String lang = request.getParameter("lang");
		String translated = "";
		String unfound = "";
		Map<String, ArrayList<String>> map = null;
		//Split into phrase Array
		String[] phraseArray = phrase.split(" ");
		//File Handler
		try {
			map = FileHandler.loadFileData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String word : phraseArray) {

				for(int i = 1; i < map.size();i++){

					//System.out.println(map.get(i + ""));
					if(word.equals(map.get(i + "").get(0))){
						if(lang.equals("Russian")){
							translated = translated + " " + map.get(i + "").get(1);
						}else{
							translated = translated + " " + map.get(i + "").get(2);	
						}//end if
				}//end for
		}//end for
		}
		
		
		for(String word2 : phraseArray){
			boolean bunfound = false;
			
			for(int i = 1; i < map.size();i++){
				if(word2.equals(map.get(i+"").get(0))){
					bunfound = true;
				}//end if
			}//end for
			if(bunfound == false){
				unfound = unfound + " " + word2;
			}
		}//end for
		response.sendRedirect( "index.jsp?translated=" + translated + "&unfound=" + unfound);
		
		//response.getWriter().append(phrase + " translates to " + translated + " in " + lang);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
