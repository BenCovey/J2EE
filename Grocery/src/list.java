

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import edu.nscc.training.grocery.model.GroceryItem;

/**
 * Servlet implementation class list
 */
@WebServlet(description = "This servlet is responsible for respondin to request(s) about grocery", urlPatterns = ("/list"), loadOnStartup = 1)
public class list extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public List<GroceryItem> items;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public list() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("I'm Alive");
		URL url;
		try
		{
			url = config.getServletContext().getResource(FileHandler.DATA_FILE);
			
			String path = url.getPath();
			items = buildGroceryItems(FileHandler.loadFileData(path));
			
		}catch(Exception E){
			System.out.println("failure");
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("I'm Dead");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		URL url = request.getServletContext().getResource(FileHandler.DATA_FILE);
		
		String path = url.getPath();
		
		items = buildGroceryItems(FileHandler.loadFileData(path));
		printList(response);
	}
		
	private java.util.List<GroceryItem> buildGroceryItems(final Map<String, String> map)
	{
		java.util.List<GroceryItem>groceries = new ArrayList<GroceryItem>();
		
		
		
		for (String key : map.keySet()){
			GroceryItem item = new GroceryItem();
			item.setName(key);
			item.setPrice(Double.parseDouble(map.get(key)));
			groceries.add(item);
		}
		return groceries;
	}
	
	private void printList(final HttpServletResponse response) throws IOException
	{
		PrintWriter writer = response.getWriter();
		writer.write("<!Doctype html>");
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>Grocery Item Management</title>");
		writer.write("<meta charset = \"utf-8\">");
		writer.write("</head>");
		writer.write("<body>");
		writer.write("<h1> List of Grocery Items </h1>");
		writer.write("<section>");
		writer.write("<table border =\"1\">");
		writer.write("<tr>");
		writer.write("<th>Item</th>");
		writer.write("<th>Price</th>");
		writer.write("</tr>");
		for (GroceryItem groceryItem : items){
			writer.write("<tr>");
			writer.write("<td>");
			writer.write(groceryItem.getName());
			writer.write("</td>");
			writer.write("<td>");
			writer.write(String.valueOf(groceryItem.getPrice()));
			writer.write("</td>");
			writer.write("</tr>");
			writer.write("</section>");
		}
		writer.write("</body>");
		writer.write("</html>");
		}
		
	
		
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
