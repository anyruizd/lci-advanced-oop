import java.sql.*;
import java.util.*;

public class Main {
    public static boolean isValidUser(Connection conn, String username, String password) throws SQLException {
        Boolean result = false;
        String sqlSelect = "SELECT * FROM auth WHERE username = ? AND password = ?";

        PreparedStatement preparedStatement = conn.prepareStatement(sqlSelect);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String usernameFromDB = resultSet.getString("username");
            String passwordFromDB = resultSet.getString("password");

            if (usernameFromDB.equals(username) && passwordFromDB.equals(password)) {
                result = true;
            }
        }
        return result;
    }

    public static void insertUser(Connection conn, String username, String password) throws SQLException {
        String sqlInsert = "INSERT INTO auth (id, username, password) VALUES (?, ?, ?)";
        PreparedStatement preparedStatementInsert = conn.prepareStatement(sqlInsert);
        preparedStatementInsert.setInt(1, 1002);
        preparedStatementInsert.setString(2, username);
        preparedStatementInsert.setString(3, password);
        int rows = preparedStatementInsert.executeUpdate();
        System.out.println("Rows inserted: " + rows);
    }

    public static void main(String[] args) {
        Connection con = null;
        // 1. Try catch block
        try {
            // 2. Load driver jdbc
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 3. Create connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hello_world", "root", "root");

            // ask the user for the username and password
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter username: ");
            String username = scanner.nextLine();
            System.out.println("Enter password: ");
            String password = scanner.nextLine();

            if (isValidUser(con, username, password)) {
                System.out.println("Welcome " + username + "!");
            } else {
                System.out.println("Inserting new user");
                insertUser(con, username, password);
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}