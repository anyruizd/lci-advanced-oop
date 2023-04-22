package com.example.myfirstjavaeeproject.DAO;
import com.example.myfirstjavaeeproject.Model.Address;
import com.example.myfirstjavaeeproject.Model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

public class DBConnection {
    private String jdbcURL = "jdbc:mysql://localhost:3306/hello_world";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";

    public DBConnection() {}

    // Manage the connection
    public Connection getConnection() {
        Connection con = null;
        try {
            // 2. load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 3. Create connection
            con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    public void insertUser(User user) {
        String sqlInsert = "INSERT INTO user (id, name, email) VALUES (?,?,?) ";
        try {
            Connection con = getConnection();
            PreparedStatement pstmInsert = con.prepareStatement(sqlInsert);
            pstmInsert.setInt(1, user.getId());
            pstmInsert.setString(2, user.getName());
            pstmInsert.setString(3, user.getEmail());
            // TODO: How to add address to user in the database
            pstmInsert.addBatch(String.valueOf(user)); // ??

            pstmInsert.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User selectUserById(int id) {
        User user = null;
        Address ad = new Address(11, "street", "city", "state", "zip");
        String sqlSelect = "SELECT * FROM user WHERE id = ? ";

        try {
            Connection con = getConnection();
            PreparedStatement pstmInsert = con.prepareStatement(sqlSelect);
            pstmInsert.setInt(1, id);
            ResultSet rs = pstmInsert.executeQuery();

            while (rs.next()) {
                int userId = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
//                String country = rs.getString("country");
                user = new User(userId, name, email, ad);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Address ad = new Address(11, "street", "city", "state", "zip");
        String sqlSelect = "SELECT * FROM user";

        try {
            Connection con = getConnection();
            PreparedStatement pstmInsert = con.prepareStatement(sqlSelect);
            ResultSet rs = pstmInsert.executeQuery();

            while (rs.next()) {
                int userId = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");

                User user = new User(userId, name, email, ad);
                users.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public boolean deleteUser(int id) {
        String sqlDelete = "DELETE FROM user WHERE id = ? ";
        boolean rowUpdated = false;
        try {
            Connection con = getConnection();
            PreparedStatement pstmInsert = con.prepareStatement(sqlDelete);
            pstmInsert.setInt(1, id);
            rowUpdated = pstmInsert.executeUpdate() > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowUpdated;
    }

    public boolean updateUser(User user) {
        String sqlUpdate = "UPDATE user SET name = ?, email = ? WHERE id = ? ";
        boolean rowUpdated = false;
        try {
            Connection con = getConnection();
            PreparedStatement pstmInsert = con.prepareStatement(sqlUpdate);
            pstmInsert.setString(1, user.getName());
            pstmInsert.setString(2, user.getEmail());
            pstmInsert.setInt(3, user.getId());

            rowUpdated = pstmInsert.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rowUpdated;
    }
}
