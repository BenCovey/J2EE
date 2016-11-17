package edu.training.uploads.controllers;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class Upload
 */
@WebServlet("/upload")
@MultipartConfig
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Upload() {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Part part = request.getPart("file"); 
		
		String filename = getFileName(part);
		File file = new File(System.getProperty("catelina.home"));
		String filePath = file.getAbsolutePath()+File.pathSeparator+filename;
		try(OutputStream out = new FileOutputStream(new File(filePath))){
			FileInputStream fileInput = (FileInputStream) request.getPart("file").getInputStream();
			byte[] bytes = new byte[1024];
			int read = 0;
			while((read = fileInput.read(bytes))!=-1){
				out.write(bytes, 0, read);
			}
			response.getWriter().append("uploaded Successfully.");
		}
		doGet(request, response);
		
	}
	private String getFileName(Part part){
		String result = "";
		for(String content : part.getHeader("content-disposition").split(";")){
			if(content.trim().startsWith("filename)")){
				result = content.split("=")[1].substring(1);
				result = result.substring(0, result.length()-1);
			}
		}
		return result;
	}

}
