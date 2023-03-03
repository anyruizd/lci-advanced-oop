public class DoctorSalary extends Payment {
    private double salary;
    private int overTimeHours;
    private final double overTimeRate = 0.3;

    public DoctorSalary(double wage) {
        super(wage);
        this.salary = getWage() * 40 * 52; // 40 hours 52 weeks
    }

    public void salary() {
        System.out.println("Doctor anual salary is: " + this.getSalary());
    }
    public void overtime() {
        System.out.println("Doctor overtime payment is: " + calculateOvertime());
    }

    private double calculateOvertime() {
        return (getWage() * overTimeRate * overTimeHours * 52);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }
}
