import java.sql.*;

public class Main {
    /*
    * File -> project structure -> libraries -> add new library -> put your project
    * Then on the right side of the screen, click on the + sign and add the .jar library you just added
    * Every time we work wit third parties, we use try catch block
    */
    public static void main(String[] args) {

        Connection connection = null;

        // Step 1. Create try catch block
        try {
            // Step 2. Load driver
            // Class is the java interface for running applications

            Class.forName("com.mysql.cj.jdbc.Driver");
            // Step 3. Create connection
            // Each driver has a driver manager that manages the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hello_world", "root", "root");

            // Step 4. Create statement
            Statement statement = connection.createStatement();
            String sqlSelect = "SELECT * FROM employees";
            // Step 5. Execute query
            ResultSet resultSet = statement.executeQuery(sqlSelect);

            while (resultSet.next()) { // as long as there is data in the table
                int id = resultSet.getInt("idemployees");
                String name = resultSet.getString("name");
                String age = resultSet.getString("age");
                System.out.println(id + " " + name + " " + age);
            }

            System.out.println("------------------ Insert ----------------------------");
            // Prepare statement
            String sqlInsert = "INSERT INTO employees (idemployees, name, age) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);

            // Set values
            preparedStatement.setInt(1, 10);
            preparedStatement.setString(2, "John");
            preparedStatement.setInt(3, 30);

            // Execute
            int rows = preparedStatement.executeUpdate();
            System.out.println("Rows inserted: " + rows);

            System.out.println("------------------ Update ----------------------------");

            // Update
            String sqlUpdate = "UPDATE employees SET name = ? WHERE idemployees = ?";
            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setString(1, "Jean");
            preparedStatementUpdate.setInt(2, 10);
            int rowsUpdated = preparedStatementUpdate.executeUpdate();
            System.out.println("Rows updated: " + rowsUpdated);

            resultSet = statement.executeQuery(sqlSelect);

            while (resultSet.next()) { // as long as there is data in the table
                int id = resultSet.getInt("idemployees");
                String name = resultSet.getString("name");
                String age = resultSet.getString("age");
                System.out.println(id + " " + name + " " + age);
            }

            System.out.println("------------------ Delete ----------------------------");

            // Delete
            String sqlDelete = "DELETE FROM employees WHERE idemployees = ?";
            PreparedStatement preparedStatementDelete = connection.prepareStatement(sqlDelete);
            preparedStatementDelete.setInt(1, 10);
            int rowsDeleted = preparedStatementDelete.executeUpdate();
            System.out.println("Rows deleted: " + rowsDeleted);


            resultSet = statement.executeQuery(sqlSelect);

            while (resultSet.next()) { // as long as there is data in the table
                int id = resultSet.getInt("idemployees");
                String name = resultSet.getString("name");
                String age = resultSet.getString("age");
                System.out.println(id + " " + name + " " + age);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}