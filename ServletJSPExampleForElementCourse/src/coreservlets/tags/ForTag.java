package coreservlets.tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com servlet, JSP, JSF, Ajax, and GWT tutorials</a>.
 */

public class ForTag extends SimpleTagSupport {
  private int count;

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public void doTag() throws JspException, IOException {
    for(int i=0; i<count; i++) {
      getJspBody().invoke(null);
    }
  }
}
