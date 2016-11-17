
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import java.net.*;
import java.net.URL;
import java.util.Map;

/**
 * Servlet Filter implementation class Security
 */
@WebFilter("/manager.html")
public class Security implements Filter {

    /**
     * Default constructor. 
     */
    public Security() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
			throws IOException,ServletException
			{
				String value = request.getParameter("username");
				if((value != null) && (passwords.get(value)!= null)){
					chain.doFilter(request, response);
				}
			}
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		URL url;
		try{
			url = config.getServletContext().getResource(FileHandler.PASSWORD_FILE);
			String path = url.getPath();
			Map<String, String> password;
			password = FileHandler.loadFileData(path);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
