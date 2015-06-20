package coreservlets.tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com servlet, JSP, JSF, Ajax, and GWT tutorials</a>.
 */

public class ThenTag extends SimpleTagSupport {
  @Override
  public void doTag() throws JspException, IOException {
    try {
      // Get parent tag (if tag). 
      IfTag ifTag = (IfTag)getParent();
      // Decide whether to output body
      if (ifTag.getTest()) {
        getJspBody().invoke(null);
      }
    } catch(Exception e)  {
      // Exception if either surrounding tag is of another
      // type (ClassCastException) or there is no surrounding
      // tag (NullPointerException)
      String msg =
        "Error: 'then' must be inside 'if'.";
      throw new JspTagException(msg);
    }
  }
}
