public abstract class Payment {
    private double wage;

    public Payment(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
    public abstract void salary();
    public abstract void overtime();
}
