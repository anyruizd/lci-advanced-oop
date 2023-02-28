public class NurseSalary extends Payment {

    private double salary;

    public NurseSalary(double salary) {
        this.salary = salary;
    }

    public double salary() {
        return this.salary;
    }
    public double overtime() {
        return this.salary*(1 + 0.15);
    }
}
