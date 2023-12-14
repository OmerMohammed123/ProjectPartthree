<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="DAO.DAOORDER"%>
<%@ page import="Structure.Orders"%>
<%@ page import="java.util.List"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="Connector.ConnectionProvider"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Orders</title>
    <style>
        body {
            display: flex;
            min-height: 100vh;
            margin: 0;
            justify-content: center;
            align-items: center;
            text-align: center;
        }

        .container {
            width: 80%;
        }

        table {
            width: 100%;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Manage Orders</h2>

        <!-- Display orders from the database -->
        <%
        DAOORDER ordersDAO = new DAOORDER(ConnectionProvider.getConnection());
                    List<Orders> orderList = ordersDAO.getAllOrders();

                    if (!orderList.isEmpty()) {
        %>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Quote ID</th>
                        <th>Price</th>
                        <th>Schedule Start</th>
                        <th>Schedule End</th>
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Orders order : orderList) { %>
                        <tr>
                            <td><%= order.getId() %></td>
                            <td><%= order.getQuoteid() %></td>
                            <td><%= order.getPrice() %></td>
                            <td><%= order.getSchedulestart() %></td>
                            <td><%= order.getScheduleend() %></td>
                            <td><a href="deleteOrder.jsp?id=<%= order.getId() %>" class="btn btn-danger btn-sm">Delete</a></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        <% } else { %>
            <p>No orders found in the database.</p>
        <% } %>

        <!-- Add a link or button to go back to the dashboard or another page -->
        <div class="mt-4">
            <a href="rootDashboard.jsp" class="btn btn-primary">Back to Dashboard</a>
        </div>
    </div>
</body>
</html>
