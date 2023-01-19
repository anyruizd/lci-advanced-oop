public class Teacher extends Person {
    private double salary;
    private String subject;
    public Teacher () {
        super();
    }

    public Teacher (String name, int age, String subject, double salary) {
        super(name, age);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public static void main(String[] args)
    {
        Teacher t = new Teacher("Any", 23, "Java", 8500);

        System.out.println("Teacher Name: " + t.getName() + "\n Age: " + t.getAge() + "\n Salary: " + t.salary + "\n Subject: " + t.getSubject());
    }
}
