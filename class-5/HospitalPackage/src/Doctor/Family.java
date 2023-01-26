package Doctor;

public class Family extends Doctor {
    private String postalCode;

    public Family(double salary, String postalCode) {
        super(salary);
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
