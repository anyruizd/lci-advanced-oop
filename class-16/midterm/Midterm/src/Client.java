import java.util.Date;

public class Client {
    private String username;
    private String password;
    private String email;
    private String phone;
    private Address address;
    private Date dateOfBirth;

    public Client() {
    }

    public Client(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Client(String username, String password, String email, Date dateOfBirth) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "ClientInfo: \n" + "-username: " + username +
                "\n-password: " + password +
                "\n-email: " + email +
                "\n-phone=" + phone;
    }
}
