/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2024-08-10 20:09:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerDash_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1723087855293L));
    _jspx_dependants.put("jar:file:/C:/Users/Admin/eclipse-workspace-Assessment/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Naman_1726_Week04/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153377882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Customer Service Navbar</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"styles.css\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Gupter:wght@400;500;700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<style>\r\n");
      out.write("    body {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    font-family: \"Gupter\", serif;\r\n");
      out.write("  font-weight: 400;\r\n");
      out.write("  font-style: normal;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("    background-color: #333;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-heading {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-menu {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    display: flex;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-menu li {\r\n");
      out.write("    margin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-menu a {\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    transition: color 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-menu a:hover {\r\n");
      out.write("    color: #ddd;\r\n");
      out.write("}\r\n");
      out.write(".main-c{\r\n");
      out.write("    display: flex;\r\n");
      out.write("    flex-direction: column;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    height: 60vh;\r\n");
      out.write("}\r\n");
      out.write(".main-c h1{\r\n");
      out.write("    font-size: 6rem;\r\n");
      out.write("}\r\n");
      out.write(".main-c p{\r\n");
      out.write("    font-size: 4rem;\r\n");
      out.write("}\r\n");
      out.write(" .card {\r\n");
      out.write("            background-color: #ffffff;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\r\n");
      out.write("            width: 300px;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            color: #333333;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .card-header {\r\n");
      out.write("            font-size: 1.5em;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            color: #007bff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .card-body {\r\n");
      out.write("            font-size: 1.2em;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .card-body .label {\r\n");
      out.write("            font-weight: bold;\r\n");
      out.write("            color: #555555;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .card-body .value {\r\n");
      out.write("            margin-left: 5px;\r\n");
      out.write("        }\r\n");
      out.write("</style>\r\n");
      out.write("    <nav class=\"navbar\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1 class=\"navbar-heading\">CustomerService</h1>\r\n");
      out.write("            <ul class=\"navbar-menu\">\r\n");
      out.write("                <li><a href=\"addOrder\">Add New Order</a></li>\r\n");
      out.write("                <li><a href=\"deleteOrder\">Delete Order</a></li>\r\n");
      out.write("                <li><a href=\"updateOrder\">Update Order</a></li>\r\n");
      out.write("                <li><a href=\"getOrder\">Get Order</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"card\">\r\n");
      out.write("        <div class=\"card-header\">\r\n");
      out.write("            Customer Details\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"card-body\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <span class=\"label\">Customer ID:</span>\r\n");
      out.write("                <span class=\"value\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div>\r\n");
      out.write("                <span class=\"label\">Customer Name:</span>\r\n");
      out.write("                <span class=\"value\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main-c\">\r\n");
      out.write("        <h1>Welcome </h1>\r\n");
      out.write("        <h3>Tell us what you want to do by selecting from above Navigationbar</h3>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
