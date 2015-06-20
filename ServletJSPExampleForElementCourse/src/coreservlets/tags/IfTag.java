package coreservlets.tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com servlet, JSP, JSF, Ajax, and GWT tutorials</a>.
 */

public class IfTag extends SimpleTagSupport {
  private boolean test;

  public void setTest(boolean test) {
    this.test = test;
  }

  public boolean getTest() {
    return(test);
  }

  @Override
  public void doTag() throws JspException, IOException {
    getJspBody().invoke(null);
  }
}
