package Student;

public class Domicile extends Student {
    private String city;

    private String phoneNumber;

    public Domicile(String name, int age, double mark, String address, String city, String phoneNumber) {
        super(name, age, mark, address);
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public Domicile(String name, double mark, String address, String city, String phoneNumber) {
        super(name, mark, address);
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
