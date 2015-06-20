package coreservlets;

/** From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on servlets, JSP, Struts, JSF, Ajax, GWT, and Java</a>.
 */

public class Employee {
  private Name name;
  private Company company;

  public Employee(Name name, Company company) {
    setName(name);
    setCompany(company);
  }

  public Name getName() {
    return (name);
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Company getCompany() {
    return (company);
  }

  public void setCompany(Company company) {
    this.company = company;
  }
}
