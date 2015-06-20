package coreservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/loop-test")
public class LoopTest extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
    String[] servers =
      {"Tomcat", "Resin", "Jetty", "WebLogic",
       "WebSphere", "JBoss", "Glassfish" };
    request.setAttribute("servers", servers);
    Object[][] records = WorldRecords.recentRecords();
    request.setAttribute("records", records);
    String address = "/WEB-INF/results/loop-test.jsp";
    RequestDispatcher dispatcher =
      request.getRequestDispatcher(address);
    dispatcher.forward(request, response);
  }
}
