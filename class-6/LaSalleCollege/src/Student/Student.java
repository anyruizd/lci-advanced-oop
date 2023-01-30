package Student;
import Person.*;
public class Student extends Person {
    private double mark;
    private String program;

    private Account account;

    public Student(String name, int age, Address address, double mark, String program, Account account) {
        super(name, age, address);
        this.mark = mark;
        this.program = program;
        this.account = account;
    }

    public Student(String name, int age, double mark, String program, Account account) {
        super(name, age);
        this.mark = mark;
        this.program = program;
        this.account = account;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public static void main(String[] args) {
        Account ac = new Account("12345", "123", "Scotia");
        Student std = new Student("Any", 23, 5.0, "Programmer analyst", ac);
        System.out.println(std.account.getAccountNumber());
    }
}
