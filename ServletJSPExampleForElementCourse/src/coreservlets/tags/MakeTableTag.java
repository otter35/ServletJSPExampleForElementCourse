package coreservlets.tags;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com servlet, JSP, JSF, Ajax, and GWT tutorials</a>.
 */

public class MakeTableTag extends SimpleTagSupport {
  private Object[][] rowItems;
  private String headerClass;
  private String bodyClass;

  public void setRowItems(Object[][] rowItems) {
    this.rowItems = rowItems;
  }

  public void setHeaderClass(String headerClass) {
    this.headerClass = headerClass;
  }

  public void setBodyClass(String bodyClass) {
    this.bodyClass = bodyClass;
  }

  @Override
  public void doTag() throws JspException, IOException {
    if (rowItems.length > 0) {
      JspContext context = getJspContext();
      JspWriter out = context.getOut();
      out.println("<TABLE BORDER=1>");
      Object[] headingRow = rowItems[0];
      printOneRow(headingRow, getStyle(headerClass), out);
      for(Object[] bodyRow: rowItems) {
        printOneRow(bodyRow, getStyle(bodyClass), out);
      }
      out.println("</TABLE>");
    }
  }

  private void printOneRow(Object[] columnEntries,
                           String style,
                           JspWriter out)
      throws IOException {
    out.println("  <TR" + style + ">");
    for(Object columnEntry: columnEntries) {
      out.println("    <TD>" + columnEntry + "</TD>");
    }
    out.println("  </TR>");
  }

  private String getStyle(String className) {
    if (className == null) {
      return("");
    } else {
      return(" CLASS=\"" + headerClass + "\"");
    }
  }
}
