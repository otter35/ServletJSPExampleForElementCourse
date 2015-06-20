package coreservlets;

import java.util.*;

/** Servlet that creates some collections whose elements will
 *  be displayed with the JSP 2.0 expression language.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF 2.0, Ajax, GWT, 
 *  Spring, Hibernate/JPA, and Java programming</a>.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/collections")
public class Collections extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    String[] firstNames = { "Bill", "Scott", "Larry" };
    List<String> lastNames = new ArrayList<String>();
    lastNames.add("Ellison");
    lastNames.add("Gates");
    lastNames.add("McNealy");
    Map<String,String> companyNames = 
      new HashMap<String,String>();
    companyNames.put("Ellison", "Sun");
    companyNames.put("Gates", "Oracle");
    companyNames.put("McNealy", "Microsoft");
    request.setAttribute("first", firstNames); 
    request.setAttribute("last", lastNames);
    request.setAttribute("company", companyNames);
    RequestDispatcher dispatcher =
      request.getRequestDispatcher("/WEB-INF/results/collections.jsp");
    dispatcher.forward(request, response);
  }
}
