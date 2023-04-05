import java.sql.*;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Connection connection = null;

        // 1. Try catch block
        try {
            // 2. Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 3. Create connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hello_world", "root", "root");

            // 4. Create statement
            String sqlSelect = "SELECT * FROM auth WHERE username = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlSelect);

            // Get username and password from user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter username: ");
            String username = scanner.nextLine();
            System.out.println("Enter password: ");
            String password = scanner.nextLine();

            // 5. Execute query
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Welcome " + resultSet.getString("username") + "!");
            } else {
                System.out.println("Inserting new user");
                String sqlInsert = "INSERT INTO auth (id, username, password) VALUES (?, ?, ?)";
                PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
                preparedStatementInsert.setInt(1, 1002);
                preparedStatementInsert.setString(2, username);
                preparedStatementInsert.setString(3, password);
                int rows = preparedStatementInsert.executeUpdate();
                System.out.println("Rows inserted: " + rows);
                System.out.println("Welcome " + username + "!");
            }

            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
