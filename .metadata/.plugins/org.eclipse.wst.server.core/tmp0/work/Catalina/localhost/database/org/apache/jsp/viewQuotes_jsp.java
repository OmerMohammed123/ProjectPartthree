/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-12-14 03:08:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Model.Quotes;
import DAO.QuotesDAO;
import Helper.ConnectionProvider;
import Model.Users;

public final class viewQuotes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/clientNavbar.jsp", Long.valueOf(1702515731000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Model.Users");
    _jspx_imports_classes.add("Helper.ConnectionProvider");
    _jspx_imports_classes.add("DAO.QuotesDAO");
    _jspx_imports_classes.add("Model.Quotes");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

// Retrieve user information from the session
Users user = (Users) session.getAttribute("user");

if (user != null) {
    // Get user ID
    int userId = user.getId();

    // Create a QuotesDAO instance and call the method to get quotes by user ID
    QuotesDAO quotesDAO = new QuotesDAO(ConnectionProvider.getConnection());
    List<Quotes> quotesList = quotesDAO.getQuotesByUserId(userId);

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>View Quotes</title>\n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<a class=\"navbar-brand\" href=\"#\">Client Home</a>\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("			data-target=\"#navbarNav\" aria-controls=\"navbarNav\"\n");
      out.write("			aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("		</button>\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("			<ul class=\"navbar-nav\">\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\"\n");
      out.write("					href=\"client_request.jsp\">Submit a Request</a></li>\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"viewQuotes.jsp\">View any \n");
      out.write("						Quotes</a></li>\n");
      out.write("                                                <li class=\"nav-item\"><a class=\"nav-link\" href=\"vieweOrder.jsp\">View\n");
      out.write("						Orders</a></li>\n");
      out.write("				<!-- Add more client-specific links as needed -->\n");
      out.write("			</ul>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("        <h2>View Quotes</h2>\n");
      out.write("        ");
 if (quotesList != null && !quotesList.isEmpty()) { 
      out.write("\n");
      out.write("            <table class=\"table\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Contractor ID</th>\n");
      out.write("                        <th>Price</th>\n");
      out.write("                        <th>Schedule Start</th>\n");
      out.write("                        <th>Schedule End</th>\n");
      out.write("                        <th>Note</th>\n");
      out.write("                        <th>Status</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 for (Quotes quote : quotesList) { 
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print( quote.getId() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( quote.getContractorid() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( quote.getPrice() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( quote.getSchedulestart() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( quote.getScheduleend() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( quote.getNote() );
      out.write("</td>\n");
      out.write("                            <td>");
      out.print( quote.getStatus() );
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        ");
 } else { 
      out.write("\n");
      out.write("            <p>No quotes available for this user.</p>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS and dependencies -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");

} else {
    // If the user is not logged in, redirect to the login page
    response.sendRedirect("userlogin.jsp?error=notLoggedIn");
}

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
