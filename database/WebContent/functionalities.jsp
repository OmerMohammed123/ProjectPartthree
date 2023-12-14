<%@page import="Structure.Bills"%>
<%@page import="DAO.FunctionalitiesDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="Structure.Users"%>
<%@ page import="Structure.Trees"%>
<%@ page import="Structure.ClientStatistics"%>
<%@ page import="DAO.UserDAO"%>
<%@ page import="DAO.QuotesDAO"%>
<%@ page import="DAO.TreesDAO"%>
<%@ page import="DAO.BillDAO"%>
<%@ page import="Structure.Quotes"%>
<%@ page import="Connector.ConnectionProvider"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Specified Functionalities</title>

       

        <script
        src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"></script>
        <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
    </head>

    <body>

        <%
                            UserDAO userDAO = new UserDAO(ConnectionProvider.getConnection());
                            List<Users> bigClients = userDAO.getBigClients();

                            List<Users> easyClients = userDAO.getEasyClients();

                            QuotesDAO quotesDAO = new QuotesDAO(ConnectionProvider.getConnection());
                            List<Quotes> oneTreeQuotes = quotesDAO.getOneTreeQuotes();

                            List<ClientStatistics> clientStatistics = userDAO.getClientStatistics();
        %>

        <div class="container mt-5">

            <a href="rootDashboard.jsp"> Dashboard </a>

            <h1 class="mb-4">Functionalities</h1>



            <!-- Example 1: Big Clients -->
            <h2>Big Clients</h2>
            <ul class="list-group">
                <%
                for (Users user : bigClients) {
                %>
                <li class="list-group-item"><%=user.getFirstname()%> <%=user.getLastname()%></li>
                    <%
                    }
                    %>
            </ul>



            <h2 class="mt-4">Easy Clients</h2>
            <ul class="list-group">
                <%
                for (Users user : easyClients) {
                %>
                <li class="list-group-item"><%=user.getFirstname()%> <%=user.getLastname()%></li>
                    <%
                    }
                    %>
            </ul>

            <h2 class="mt-4">One Tree Quotes</h2>
            <ul class="list-group">
                <%
                for (Quotes quote : oneTreeQuotes) {
                %>
                <li class="list-group-item">Quote ID: <%=quote.getId()%>, Client
                    ID: <%=quote.getClientid()%></li>
                    <%
                    }
                    %>
            </ul>

            <h2 class="mt-4">Client Statistics</h2>
            <table class="table table-bordered mt-3">
                <thead>
                    <tr>
                        <th>Client ID</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Tree Count</th>
                        <th>Total Due</th>
                        <th>Total Paid</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                    for (ClientStatistics stats : clientStatistics) {
                    %>
                    <tr>
                        <td><%=stats.getClientId()%></td>
                        <td><%=stats.getFirstName()%></td>
                        <td><%=stats.getLastName()%></td>
                        <td><%=stats.getTreeCount()%></td>
                        <td><%=stats.getTotalDue()%></td>
                        <td><%=stats.getTotalPaid()%></td>
                    </tr>
                    <%
                    }
                    %>
                </tbody>
            </table>


            <%
                                        FunctionalitiesDAO specifiedFunctionalitiesDAO = new FunctionalitiesDAO(ConnectionProvider.getConnection());
                                        TreesDAO treesDAO = new TreesDAO(ConnectionProvider.getConnection());

                                        // Example 5: Prospective Clients
                                        List<Users> prospectiveClients = specifiedFunctionalitiesDAO.getBigClients();
            %>

            <h2 class="mt-4">Prospective Clients</h2>
            <ul class="list-group">
                <%
                for (Users client : prospectiveClients) {
                %>
                <li class="list-group-item">
                    <%="Client ID: " + client.getId() + ", Name: " + client.getFirstname() + " " + client.getLastname()%>
                </li>
                <%
                }
                %>
            </ul>

            <%
                            List<Trees> allTrees = treesDAO.getAllTreesForQuote(1); // Assuming quoteid 1 for the example
                            Trees highestTree = null;

                            // Find the highest tree
                            for (Trees tree : allTrees) {
                                if (highestTree == null || tree.getHeight() > highestTree.getHeight()) {
                                    highestTree = tree;
                                }
                            }
            %>

<h2 class="mt-4">Highest Tree</h2>
<ul class="list-group">
    <%
    if (highestTree != null) {
    %>
    <li class="list-group-item">
        <%="Tree ID: " + highestTree.getId() + ", Height: " + highestTree.getHeight()%>
    </li>
    <%
    } else {
    %>
    <li class="list-group-item">No trees found</li>
    <%
    }
    %>
</ul>



            <%
                            BillDAO billsDAO = new BillDAO(ConnectionProvider.getConnection());

                            List<Bills> overdueBills = billsDAO.getOverdueBills();
            %>


            <h2 class="mt-4">Overdue Bills</h2>
            <table class="table table-bordered mt-3">
                <thead>
                    <tr>
                        <th>Bill ID</th>
                        <th>Order ID</th>
                        <th>Status</th>
                        <th>Schedule End</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Bills bill : overdueBills) {%>
                    <tr>
                        <td><%= bill.getId()%></td>
                        <td><%= bill.getOrderid()%></td>
                        <td><%= bill.getStatus()%></td>
                        <td><%= bill.getOrder().getScheduleend()%></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>


            <%
                List<Users> badClients = specifiedFunctionalitiesDAO.getEasyClients();
            %>

            <h2 class="mt-4">Bad Clients</h2>
            <ul class="list-group">
                <% for (Users client : badClients) {%>
                <li class="list-group-item">
                    <%= "Client ID: " + client.getId() + ", Name: " + client.getFirstname() + " " + client.getLastname()%>
                </li>
                <% }%>
            </ul>







            <%

                List<Users> goodClients = specifiedFunctionalitiesDAO.getGoodClients();
            %>

            <h2 class="mt-4">Good Clients</h2>
            <ul class="list-group">
                <%
                    List<Users> goodClientss = specifiedFunctionalitiesDAO.getGoodClients();
                    for (Users client : goodClientss) {
                %>
                <li class="list-group-item">
                    <%= "Client ID: " + client.getId() + ", Name: " + client.getFirstname() + " " + client.getLastname()%>
                </li>
                <% }%>
            </ul>


         

            <h3>Overdue Bills</h3>
            <ul class="list-group">
                <%

                    for (Bills bill : overdueBills) {
                %>
                <li class="list-group-item">
                    <%= "Bill ID: " + bill.getId() + ", Order ID: " + bill.getOrderid() + ", Amount: $" + bill.getBalance()%>
                </li>
                <%
                    }
                %>
            </ul>

           



        </div>

    </body>

</html>