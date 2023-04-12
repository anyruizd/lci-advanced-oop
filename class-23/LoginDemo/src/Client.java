import java.sql.*;
import java.util.Scanner;

public class Client {
    // 1. Create class client
    // username, password as attributes and other info
    // client has a Login class as an attribute with username and password
    // ask user to insert password and username
    // give the option to create account
    // if the user creates the account you create the client object and insert it in the database

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Login login;
    static int id = 1010;

    public Client(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = new Login(username, password);

    }

    public void insertClient(Connection conn, Client client) throws SQLException {
        String sqlInsert = "INSERT INTO client (id, username, first_name, last_name) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatementInsert = conn.prepareStatement(sqlInsert);
        preparedStatementInsert.setInt(1, Client.id);
        preparedStatementInsert.setString(2, client.getUsername());
        preparedStatementInsert.setString(3, client.getFirstName());
        preparedStatementInsert.setString(4, client.getLastName());

        int rows = preparedStatementInsert.executeUpdate();
        System.out.println("Rows inserted: " + rows);

        Client.id++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public static void main(String[] args) {

        // ask the user if he wants to create an account option 2 or login option 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to login or 2 to create an account: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        if(option == 1) {
            System.out.println("Enter username: ");
            String username = scanner.nextLine();
            System.out.println("Enter password: ");
            String password = scanner.nextLine();
            Login login = new Login(username, password);
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hello_world", "root", "root");
                if(login.checkLogin(connection)) {
                    System.out.println("Welcome " + username + "!");
                } else {
                    System.out.println("Wrong username or password");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else if(option == 2) {
            System.out.println("Enter username: ");
            String username = scanner.nextLine();
            System.out.println("Enter password: ");
            String password = scanner.nextLine();
            System.out.println("Enter first name: ");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name: ");
            String lastName = scanner.nextLine();
            Client client = new Client(username, password, firstName, lastName);
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hello_world", "root", "root");
                client.insertClient(connection, client);
                client.getLogin().checkLogin(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Wrong option");
        }

    }
}
