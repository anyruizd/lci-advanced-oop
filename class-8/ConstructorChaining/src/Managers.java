public class Managers extends Employee {
    public String department;
    public int extraHours;

    public CompanyAddress WorkAddress;
    public Managers () {
        super();
    }

    public void display() {
        System.out.println(this.department + " " + this.extraHours);
    }

    public static void main(String[] args) {
        Managers manager = new Managers();
        manager.display();
    }
}
