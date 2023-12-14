// ClientRequestServlet.java
package Servlete;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connector.ConnectionProvider;

@WebServlet("/ClientRequestServlet")
public class RequestServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String clientName = request.getParameter("clientName");
        String clientAddress = request.getParameter("clientAddress");
        String clientEmail = request.getParameter("clientEmail");
        String treeDetails = request.getParameter("treeDetails");


        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = ConnectionProvider.getConnection();

            String query = "INSERT INTO Users (firstname, lastname, email) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, clientName);
            pstmt.setString(2, clientAddress);
            pstmt.setString(3, clientEmail);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                response.sendRedirect("success.jsp"); 
            } else {
                // Registration failed
                response.sendRedirect("failure.jsp"); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp"); 
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}