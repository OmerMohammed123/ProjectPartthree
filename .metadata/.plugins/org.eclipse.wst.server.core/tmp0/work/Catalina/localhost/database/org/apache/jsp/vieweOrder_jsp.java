/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-12-14 00:52:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.BillsDAO;
import Model.Bills;
import java.util.List;
import java.io.*;
import java.util.*;
import java.sql.*;
import Helper.ConnectionProvider;
import Model.Users;

public final class vieweOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1664147366000L));
    _jspx_dependants.put("jar:file:/Users/omermohammed/Desktop/eclipse-workspacethreethree/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/database/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153399482000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Model.Bills");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Model.Users");
    _jspx_imports_classes.add("Helper.ConnectionProvider");
    _jspx_imports_classes.add("DAO.BillsDAO");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Manage Bills</title>\n");
      out.write("<!-- Include your CSS stylesheets here -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<div>\n");
      out.write("		<h2>Manage Bills</h2>\n");
      out.write("\n");
      out.write("		<!-- Display all bills -->\n");
      out.write("		<table border=\"1\">\n");
      out.write("			<thead>\n");
      out.write("				<tr>\n");
      out.write("					<th>ID</th>\n");
      out.write("					<th>Order ID</th>\n");
      out.write("					<th>Price</th>\n");
      out.write("					<th>Discount</th>\n");
      out.write("					<th>Balance</th>\n");
      out.write("					<th>Status</th>\n");
      out.write("					<th>Action</th>\n");
      out.write("				</tr>\n");
      out.write("			</thead>\n");
      out.write("			<tbody>\n");
      out.write("				");

				BillsDAO billsDAO = new BillsDAO(ConnectionProvider.getConnection());
				List<Bills> allBills = billsDAO.getAllBillsForOrder(0); // 0 or any specific order ID
				for (Bills bill : allBills) {
				
      out.write("\n");
      out.write("				<tr>\n");
      out.write("					<td>");
      out.print(bill.getId());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bill.getOrderid());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bill.getPrice());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bill.getDiscount());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bill.getBalance());
      out.write("</td>\n");
      out.write("					<td>");
      out.print(bill.getStatus());
      out.write("</td>\n");
      out.write("					<td><a href=\"processBill.jsp?id=");
      out.print(bill.getId());
      out.write("&action=pay\">Pay</a>\n");
      out.write("						| <a href=\"processBill.jsp?id=");
      out.print(bill.getId());
      out.write("&action=cancel\">Cancel</a></td>\n");
      out.write("				</tr>\n");
      out.write("				");

				}
				if (allBills.isEmpty()) {
				
      out.write("\n");
      out.write("				<tr>\n");
      out.write("					<td colspan=\"7\">No bills available.</td>\n");
      out.write("				</tr>\n");
      out.write("				");

				}
				
      out.write("\n");
      out.write("			</tbody>\n");
      out.write("		</table>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
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