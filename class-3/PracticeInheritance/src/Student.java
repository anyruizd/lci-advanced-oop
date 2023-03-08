public class Student extends Person {
    private double grade;
    public Student () {}

    public Student (String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args)
    {
        Student st = new Student("Any", 23, 4.5);
        System.out.println("Student Name: " + st.getName() + "\n Age: " + st.getAge() + "\n Grade: " + st.grade);
    }
}
