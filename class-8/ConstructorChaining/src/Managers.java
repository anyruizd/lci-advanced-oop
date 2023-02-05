public class Managers extends Employee {
    public String department;
    public int extraHours;

    public CompanyAddress WorkAddress;
    public Managers () {

    }

    public void display() {
        System.out.println(this.department + " " + this.extraHours);
    }
}
