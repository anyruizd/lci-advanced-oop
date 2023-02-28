public class DoctorSalary extends Payment {
    private double salary;

    public DoctorSalary(double salary) {
        this.salary = salary;
    }

    public double salary() {
        return this.salary;
    }
    public double overtime() {
        return this.salary*(1 + 0.20);
    }
}
