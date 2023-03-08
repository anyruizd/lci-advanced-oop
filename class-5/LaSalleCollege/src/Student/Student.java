package Student;
import Person.*;
public class Student extends Person {
    private double mark;
    private String program;

    public Student(String name, int age, double mark, String program) {
        super(name, age);
        this.mark = mark;
        this.program = program;
    }

    public Student(String name, int age, Address address, double mark, String program) {
        super(name, age, address);
        this.mark = mark;
        this.program = program;
    }

    public Student(String name, int age, Address address, String program) {
        super(name, age, address);
        this.program = program;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public static void main(String[] args) {
        Address address = new Address("4937", "King Edward Avenue", "2");
        Student st = new Student("JM", 12, address, 2.5, "Cinema");
        System.out.println(st.getName() + st.getAddress());
    }
}
