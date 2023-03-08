package Student;

import Person.*;

public class Domicile extends Student {
    private String city;

    private String phoneNumber;

    public Domicile(String name, int age, Address address, double mark, String program, String city, String phoneNumber) {
        super(name, age, address, mark, program);
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
