import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class orderofworkdao {
    private Connection connect = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public orderofworkdao() {
  
    }

    // All these are basically the constructors and etc
    protected void connect() throws SQLException {
        if (connect == null || connect.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb?allowPublicKeyRetrieval=true&useSSL=false&user=john&password=yaHareemu123@");               }
        	System.out.println(connect);
    }

    protected void disconnect() throws SQLException {
        if (connect != null && !connect.isClosed()) {
            connect.close();
        }
    }

    public List<orderofwork> listAllOrders() throws SQLException {
        List<orderofwork> orderList = new ArrayList<orderofwork>();

        String sql = "SELECT * FROM OrderOfWork";

        connect();
        preparedStatement = connect.prepareStatement(sql);
        resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int orderID = resultSet.getInt("orderID");
            String workStatus = resultSet.getString("workStatus");
            int quoteID = resultSet.getInt("quoteID");

            orderofwork order = new orderofwork(orderID, workStatus, quoteID);
            orderList.add(order);
        }

        resultSet.close();
        disconnect();

        return orderList;
    }

    public void insert(orderofwork order) throws SQLException {
        connect();
        String sql = "INSERT INTO OrderOfWork (workStatus, quoteID) VALUES (?, ?)";
        preparedStatement = connect.prepareStatement(sql);

        preparedStatement.setString(1, order.getWorkStatus());
        preparedStatement.setInt(2, order.getQuoteID());

        preparedStatement.executeUpdate();
        preparedStatement.close();
        disconnect();
    }

    public boolean delete(int orderID) throws SQLException {
        connect();
        String sql = "DELETE FROM OrderOfWork WHERE orderID = ?";
        preparedStatement = connect.prepareStatement(sql);
        preparedStatement.setInt(1, orderID);

        boolean rowDeleted = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        disconnect();

        return rowDeleted;
    }

    public boolean update(orderofwork order) throws SQLException {
        connect();
        String sql = "UPDATE OrderOfWork SET workStatus = ?, quoteID = ? WHERE orderID = ?";
        preparedStatement = connect.prepareStatement(sql);
        preparedStatement.setString(1, order.getWorkStatus());
        preparedStatement.setInt(2, order.getQuoteID());
        preparedStatement.setInt(3, order.getOrderID());

        boolean rowUpdated = preparedStatement.executeUpdate() > 0;
        preparedStatement.close();
        disconnect();

        return rowUpdated;
    }

    public orderofwork getOrderById(int orderID) throws SQLException {
        connect();
        String sql = "SELECT * FROM OrderOfWork WHERE orderID = ?";
        preparedStatement = connect.prepareStatement(sql);
        preparedStatement.setInt(1, orderID);

        ResultSet resultSet = preparedStatement.executeQuery();

        orderofwork order = null;
        if (resultSet.next()) {
            String workStatus = resultSet.getString("workStatus");
            int quoteID = resultSet.getInt("quoteID");

            order = new orderofwork(orderID, workStatus, quoteID);
        }

        resultSet.close();
        preparedStatement.close();
        disconnect();

        return order;
    }

    public boolean isValid(int orderID) throws SQLException {
        connect();
        String sql = "SELECT * FROM OrderOfWork WHERE orderID = ?";
        preparedStatement = connect.prepareStatement(sql);
        preparedStatement.setInt(1, orderID);

        ResultSet resultSet = preparedStatement.executeQuery();

        boolean valid = !resultSet.next(); // If resultSet is empty, the ID is valid

        resultSet.close();
        preparedStatement.close();
        disconnect();

        return valid;
    }
}