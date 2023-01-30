package Student;

import Person.Account;
import Person.Address;

public class Domicile extends Student {
    private String city;

    private String phoneNumber;

    public Domicile(String name, int age, Address address, double mark, String program, Account account, String city, String phoneNumber) {
        super(name, age, address, mark, program, account);
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public Domicile(String name, int age, double mark, String program, Account account, String city, String phoneNumber) {
        super(name, age, mark, program, account);
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
