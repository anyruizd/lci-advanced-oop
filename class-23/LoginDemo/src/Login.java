import java.sql.*;

public class Login {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkLogin(Connection conn) throws SQLException {
        String sqlSelect = "SELECT * FROM auth WHERE username = ? AND password = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sqlSelect);

        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            return true;
        } else {
            return false;
        }
    }

}
