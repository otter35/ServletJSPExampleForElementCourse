package coreservlets.tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import coreservlets.ServletUtilities;

/** Tag that replaces special HTML characters (like less than
 *  and greater than signs) with their HTML character entities.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com servlet, JSP, JSF, Ajax, and GWT tutorials</a>.
 */

public class HtmlFilterTag extends SimpleTagSupport {
  @Override
  public void doTag() throws JspException, IOException {
    // Buffer tag body's output
    StringWriter stringWriter = new StringWriter();
    getJspBody().invoke(stringWriter);

    // Filter out any special HTML characters
    // (e.g., "<" becomes "&lt;")
    String output =
      ServletUtilities.filter(stringWriter.toString());

    // Send output to the client
    JspWriter out = getJspContext().getOut();
    out.print(output);
  }
}
