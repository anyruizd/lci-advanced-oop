package Teacher;
import Person.*;

public class Teacher extends Person {
    private int officeNumber;
    private String subject;

    public Teacher(String name, int age, Address address, int officeNumber, String subject) {
        super(name, age, address);
        this.officeNumber = officeNumber;
        this.subject = subject;
    }

    public Teacher(String name, int age, int officeNumber, String subject) {
        super(name, age);
        this.officeNumber = officeNumber;
        this.subject = subject;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
