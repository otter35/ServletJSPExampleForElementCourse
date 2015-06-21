package coreservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet that reads a code snippet from the request and displays it inside a
 * PRE tag. Filters the special HTML characters.
 * <p>
 * From <a href="http://courses.coreservlets.com/Course-Materials/">the
 * coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and
 * Java</a>.
 */

//	?Quiz : The TestServlet, accessed via the URL 
//	Hint : matching between ? , <FORM ACTION="?"> and @WebServlet("?")
// @WebServlet("?")
public class SimpleGetPost extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2689059705108017275L;
	private String message;

	public void init() throws ServletException {
		// Do required initialization
		message = "Hello World";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		handleRequest(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		handleRequest(request, response);
	}

	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// Get Parameter From HttpServletRequest
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");

		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
		out.println("<h1>" + firstName + " " + lastName + "</h1>");
	}

	public void destroy() {
		// do nothing.
	}

}
