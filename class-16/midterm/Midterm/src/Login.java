import java.util.ArrayList;
import java.util.List;

public class Login {
    private String username;
    private String password;

    private List<Client> usersList = new ArrayList<Client>();
    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void createAccount(Client client) {
        usersList.add(client);
        System.out.println("Account created successfully");
    }

    public boolean isValidMember(String username, String password) {
        boolean isValid = false;
        for (Client client : usersList) {
            if (client.getUsername().equals(username) && client.getPassword().equals(password)) {
                System.out.println("Welcome " + username);
                isValid = true;
            }
        }

        if (!isValid) {
            System.out.println("Invalid username or password");
        }
        return isValid;
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
}
