package coreservlets.tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com servlet, JSP, JSF, Ajax, and GWT tutorials</a>.
 */

public class ForEachTag extends SimpleTagSupport {
  private Object[] items;
  private String attributeName;

  public void setItems(Object[] items) {
    this.items = items;
  }

  public void setVar(String attributeName) {
    this.attributeName = attributeName;
  }

  @Override
  public void doTag() throws JspException, IOException {
    for(Object item: items) {
      getJspContext().setAttribute(attributeName, item);
      getJspBody().invoke(null);
    }
  }
}
