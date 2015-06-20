package coreservlets;

/** Servlet that creates some scoped variables (objects stored
 *  as attributes in one of the standard locations). Forwards
 *  to a JSP page that uses the expression language to
 *  display the values.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF 2.0, Ajax, GWT, 
 *  Spring, Hibernate/JPA, and Java programming</a>.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/scoped-vars")
public class ScopedVars extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    request.setAttribute("attribute1", "First Value");
    HttpSession session = request.getSession();
    session.setAttribute("attribute2", "Second Value");
    ServletContext application = getServletContext();
    application.setAttribute("attribute3",
                             new java.util.Date());
    request.setAttribute("repeated", "Request");
    session.setAttribute("repeated", "Session");
    application.setAttribute("repeated", "ServletContext");
    RequestDispatcher dispatcher =
      request.getRequestDispatcher("/WEB-INF/results/scoped-vars.jsp");
    dispatcher.forward(request, response);
  }
}
