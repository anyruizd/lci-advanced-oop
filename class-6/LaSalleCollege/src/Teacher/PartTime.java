package Teacher;

import Person.Address;

public class PartTime extends Teacher {
    private String email;
    private String phoneNumber;

    public PartTime(String name, int age, Address address, int officeNumber, String subject, String email, String phoneNumber) {
        super(name, age, address, officeNumber, subject);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public PartTime(String name, int age, int officeNumber, String subject, String email, String phoneNumber) {
        super(name, age, officeNumber, subject);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
