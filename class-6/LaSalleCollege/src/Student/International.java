package Student;

import Person.Account;
import Person.Address;

public class International extends Student {
    private String country;
    private double tuitionFee;

    public International(String name, int age, Address address, double mark, String program, Account account, String country, double tuitionFee) {
        super(name, age, address, mark, program, account);
        this.country = country;
        this.tuitionFee = tuitionFee;
    }

    public International(String name, int age, double mark, String program, Account account, String country, double tuitionFee) {
        super(name, age, mark, program, account);
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
//        International i = new International("Any", 90, "1975 maisonneuve boulevard", "Colombia", 30000);
    }
}
