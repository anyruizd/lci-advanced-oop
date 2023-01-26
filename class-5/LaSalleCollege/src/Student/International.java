package Student;

public class International extends Student {
    private String country;
    private double tuitionFee;

    public International(String name, int age, double mark, String address, String country, double tuitionFee) {
        super(name, age, mark, address);
        this.country = country;
        this.tuitionFee = tuitionFee;
    }

    public International(String name, double mark, String address, String country, double tuitionFee) {
        super(name, mark, address);
        this.country = country;
        this.tuitionFee = tuitionFee;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public static void main(String[] args) {
        International i = new International("Any", 90, "1975 maisonneuve boulevard", "Colombia", 30000);

    }
}
