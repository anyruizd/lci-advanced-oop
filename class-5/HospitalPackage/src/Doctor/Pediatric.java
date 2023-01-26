package Doctor;

public class Pediatric extends Doctor {
    private String phoneNumber;

    public Pediatric(double salary, String phoneNumber) {
        super(salary);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
