/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-12-14 03:26:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Bills;
import DAO.SpecifiedFunctionalitiesDAO;
import java.util.List;
import Model.Users;
import Model.Trees;
import Model.ClientStatistics;
import DAO.UserDAO;
import DAO.QuotesDAO;
import DAO.TreesDAO;
import DAO.BillsDAO;
import Model.Quotes;
import Helper.ConnectionProvider;

public final class specifiedfunctionalities_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Model.Bills");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Model.Users");
    _jspx_imports_classes.add("Helper.ConnectionProvider");
    _jspx_imports_classes.add("DAO.QuotesDAO");
    _jspx_imports_classes.add("DAO.UserDAO");
    _jspx_imports_classes.add("DAO.TreesDAO");
    _jspx_imports_classes.add("DAO.BillsDAO");
    _jspx_imports_classes.add("Model.Trees");
    _jspx_imports_classes.add("DAO.SpecifiedFunctionalitiesDAO");
    _jspx_imports_classes.add("Model.ClientStatistics");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\"\n");
      out.write("              content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Specified Functionalities</title>\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <!-- Bootstrap JS and Popper.js (if needed) -->\n");
      out.write("        <script\n");
      out.write("        src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script\n");
      out.write("        src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            // Declare and initialize variables
            UserDAO userDAO = new UserDAO(ConnectionProvider.getConnection());
            List<Users> bigClients = userDAO.getBigClients();

            List<Users> easyClients = userDAO.getEasyClients();

            QuotesDAO quotesDAO = new QuotesDAO(ConnectionProvider.getConnection());
            List<Quotes> oneTreeQuotes = quotesDAO.getOneTreeQuotes();

            List<ClientStatistics> clientStatistics = userDAO.getClientStatistics();
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("\n");
      out.write("            <a href=\"rootDashboard.jsp\"> Dashboard </a>\n");
      out.write("\n");
      out.write("            <h1 class=\"mb-4\">Functionalities</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Example 1: Big Clients -->\n");
      out.write("            <h2>Big Clients</h2>\n");
      out.write("            <ul class=\"list-group\">\n");
      out.write("                ");

                    for (Users user : bigClients) {
                
      out.write("\n");
      out.write("                <li class=\"list-group-item\">");
      out.print(user.getFirstname());
      out.write(' ');
      out.print(user.getLastname());
      out.write("</li>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Example 2: Easy Clients -->\n");
      out.write("            <h2 class=\"mt-4\">Easy Clients</h2>\n");
      out.write("            <ul class=\"list-group\">\n");
      out.write("                ");

                    for (Users user : easyClients) {
                
      out.write("\n");
      out.write("                <li class=\"list-group-item\">");
      out.print(user.getFirstname());
      out.write(' ');
      out.print(user.getLastname());
      out.write("</li>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <!-- Example 3: One Tree Quotes -->\n");
      out.write("            <h2 class=\"mt-4\">One Tree Quotes</h2>\n");
      out.write("            <ul class=\"list-group\">\n");
      out.write("                ");

                    for (Quotes quote : oneTreeQuotes) {
                
      out.write("\n");
      out.write("                <li class=\"list-group-item\">Quote ID: ");
      out.print(quote.getId());
      out.write(", Client\n");
      out.write("                    ID: ");
      out.print(quote.getClientid());
      out.write("</li>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <!-- Example 4: Client Statistics -->\n");
      out.write("            <h2 class=\"mt-4\">Client Statistics</h2>\n");
      out.write("            <table class=\"table table-bordered mt-3\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Client ID</th>\n");
      out.write("                        <th>First Name</th>\n");
      out.write("                        <th>Last Name</th>\n");
      out.write("                        <th>Tree Count</th>\n");
      out.write("                        <th>Total Due</th>\n");
      out.write("                        <th>Total Paid</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                        for (ClientStatistics stats : clientStatistics) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(stats.getClientId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stats.getFirstName());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stats.getLastName());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stats.getTreeCount());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stats.getTotalDue());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(stats.getTotalPaid());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                // Assuming you have a connection object named 'con'
                SpecifiedFunctionalitiesDAO specifiedFunctionalitiesDAO = new SpecifiedFunctionalitiesDAO(ConnectionProvider.getConnection());
                TreesDAO treesDAO = new TreesDAO(ConnectionProvider.getConnection());

                // Example 5: Prospective Clients
                List<Users> prospectiveClients = specifiedFunctionalitiesDAO.getBigClients();
            
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Example 5: Prospective Clients -->\n");
      out.write("            <h2 class=\"mt-4\">Prospective Clients</h2>\n");
      out.write("            <ul class=\"list-group\">\n");
      out.write("                ");
 for (Users client : prospectiveClients) {
      out.write("\n");
      out.write("                <li class=\"list-group-item\">\n");
      out.write("                    ");
      out.print( "Client ID: " + client.getId() + ", Name: " + client.getFirstname() + " " + client.getLastname());
      out.write("\n");
      out.write("                </li>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            ");

                // Example 6: Highest Tree
                List<Trees> allTrees = treesDAO.getAllTreesForQuote(1); // Assuming quoteid 1 for the example
                Trees highestTree = null;

                // Find the highest tree
                for (Trees tree : allTrees) {
                    if (highestTree == null || tree.getHeight() > highestTree.getHeight()) {
                        highestTree = tree;
                    }
                }
            
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Example 6: Highest Tree -->\n");
      out.write("           <!-- Example 6: Highest Tree -->\n");
      out.write("<h2 class=\"mt-4\">Highest Tree</h2>\n");
      out.write("<ul class=\"list-group\">\n");
      out.write("    ");

        if (highestTree != null) {
    
      out.write("\n");
      out.write("    <li class=\"list-group-item\">\n");
      out.write("        ");
      out.print( "Tree ID: " + highestTree.getId() + ", Height: " + highestTree.getHeight());
      out.write("\n");
      out.write("    </li>\n");
      out.write("    ");

        } else {
    
      out.write("\n");
      out.write("    <li class=\"list-group-item\">No trees found</li>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                // Assuming you have a connection object named 'con'
                BillsDAO billsDAO = new BillsDAO(ConnectionProvider.getConnection());

                // Example 7: Overdue Bills
                List<Bills> overdueBills = billsDAO.getOverdueBills();
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Example 7: Overdue Bills -->\n");
      out.write("            <h2 class=\"mt-4\">Overdue Bills</h2>\n");
      out.write("            <table class=\"table table-bordered mt-3\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Bill ID</th>\n");
      out.write("                        <th>Order ID</th>\n");
      out.write("                        <th>Status</th>\n");
      out.write("                        <th>Schedule End</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 for (Bills bill : overdueBills) {
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( bill.getId());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( bill.getOrderid());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( bill.getStatus());
      out.write("</td>\n");
      out.write("                        <!-- Assuming there is an 'Orders' class with a method 'getScheduleEnd()' -->\n");
      out.write("                        <td>");
      out.print( bill.getOrder().getScheduleend());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                // Example 8: Bad Clients
                List<Users> badClients = specifiedFunctionalitiesDAO.getEasyClients();
            
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Example 8: Bad Clients -->\n");
      out.write("            <h2 class=\"mt-4\">Bad Clients</h2>\n");
      out.write("            <ul class=\"list-group\">\n");
      out.write("                ");
 for (Users client : badClients) {
      out.write("\n");
      out.write("                <li class=\"list-group-item\">\n");
      out.write("                    ");
      out.print( "Client ID: " + client.getId() + ", Name: " + client.getFirstname() + " " + client.getLastname());
      out.write("\n");
      out.write("                </li>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");


                // Example 9: Good Clients
                List<Users> goodClients = specifiedFunctionalitiesDAO.getGoodClients();
            
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Example 9: Good Clients -->\n");
      out.write("            <h2 class=\"mt-4\">Good Clients</h2>\n");
      out.write("            <ul class=\"list-group\">\n");
      out.write("                ");

                    List<Users> goodClientss = specifiedFunctionalitiesDAO.getGoodClients();
                    for (Users client : goodClientss) {
                
      out.write("\n");
      out.write("                <li class=\"list-group-item\">\n");
      out.write("                    ");
      out.print( "Client ID: " + client.getId() + ", Name: " + client.getFirstname() + " " + client.getLastname());
      out.write("\n");
      out.write("                </li>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("            <!-- Section to display overdue bills -->\n");
      out.write("            <h3>Overdue Bills</h3>\n");
      out.write("            <ul class=\"list-group\">\n");
      out.write("                ");


                    for (Bills bill : overdueBills) {
                
      out.write("\n");
      out.write("                <li class=\"list-group-item\">\n");
      out.write("                    ");
      out.print( "Bill ID: " + bill.getId() + ", Order ID: " + bill.getOrderid() + ", Amount: $" + bill.getBalance());
      out.write("\n");
      out.write("                </li>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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