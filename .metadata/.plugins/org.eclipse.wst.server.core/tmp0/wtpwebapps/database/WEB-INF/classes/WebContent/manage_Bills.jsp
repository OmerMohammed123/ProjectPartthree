<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="DAO.BillDAO"%>
<%@ page import="Structure.Bills"%>
<%@ page import="java.util.List"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="Connector.ConnectionProvider"%>
<%@ page import="Structure.Users"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage All Bills</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        div {
            text-align: center;
        }
        table {
            margin-top: 20px; /* Adjust the margin as needed */
        }
    </style>
</head>
<body>
    <div>
        <h1>Manage All Bills</h1>

        <!-- Display all bills -->
        <table border="1">
            <thead>
                <tr>
                    <th>---ID---</th>
                    <th>---Order ID---</th>
                    <th>---Price---</th>
                    <th>---Discount---</th>
                    <th>---Balance---</th>
                    <th>---Status---</th>
                    <th>---Action---</th>
                </tr>
            </thead>
            <tbody>
                <%
                BillDAO billsDAO = new BillDAO(ConnectionProvider.getConnection());
                                List<Bills> allBills = billsDAO.getAllBills(); // 0 or any specific order ID
                                for (Bills bill : allBills) {
                %>
                <tr>
                    <td><%=bill.getId()%></td>
                    <td><%=bill.getOrderid()%></td>
                    <td><%=bill.getPrice()%></td>
                    <td><%=bill.getDiscount()%></td>
                    <td><%=bill.getBalance()%></td>
                    <td><%=bill.getStatus()%></td>
                    <td> | <a href="processBill.jsp?id=<%=bill.getId()%>&action=cancel">Cancel</a></td>
                </tr>
                <%
                }
                if (allBills.isEmpty()) {
                %>
                <tr>
                    <td colspan="7">No bills available.</td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
