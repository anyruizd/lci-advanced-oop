public class TechnicianSalary extends Payment {
    private double salary;

    public TechnicianSalary(double salary) {
        this.salary = salary;
    }

    public double salary() {
        return this.salary;
    }
    public double overtime() {
        return this.salary*(1 + 0.10);
    }
}
