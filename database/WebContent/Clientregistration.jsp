<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Client Registration</title>
</head>

<body>
<div align="left">
        <h1>Client Registration Page!</h1>
        <a href="login.jsp" target="_self">Logout</a><br><br>
    
        <form action="registerClient" method="post">
            <table border="1">
                <tr>
                    <th>First Name: </th>
                    <td align="left">
                        <input type="text" name="firstName" size="45" value="" onfocus="this.value='';">
                    </td>
                </tr>
                <tr>
                    <th>Last Name: </th>
                    <td align="left">
                        <input type="text" name="lastName" size="45" value="" onfocus="this.value='';">
                    </td>
                </tr>
                <tr>
                    <th>Address: </th>
                    <td align="left">
                        <input type="text" name="address" size="45" value="" onfocus="this.value='';">
                    </td>
                </tr>
                <tr>
                    <th>Credit Card Info: </th>
                    <td align="left">
                        <input type="text" name="creditCard" size="45" value="" onfocus="this.value='';">
                    </td>
                </tr>
               
                <tr>
                    <th>Email: </th>
                    <td align="left">
                        <input type="text" name="email" size="45" value="" onfocus="this.value='';">
                    </td>
                </tr>
                <tr>
                    <td align="left" colspan="2">
                        <input type="submit" value="Register">
                    </td>
                </tr>
            </table>
        </form>
    </div>
     <p>If previously registered click here!</p>
        <a href="Clientportal.jsp" target="_self">Previously Registered</a><br><br>
    </div>
</body>
</html>