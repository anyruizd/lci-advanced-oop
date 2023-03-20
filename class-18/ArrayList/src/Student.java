import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Student {
    private String name;
    private int mathGrade;
    private int physicsGrade;
    private int chemistryGrade;

    public Student() {
    }

    public Student(String name, int mathGrade, int physicsGrade, int chemistryGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.physicsGrade = physicsGrade;
        this.chemistryGrade = chemistryGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getPhysicsGrade() {
        return physicsGrade;
    }

    public void setPhysicsGrade(int physicsGrade) {
        this.physicsGrade = physicsGrade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(int chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +
                " - Grade: " + this.totalMark();
    }

    public int totalMark () {
        int sum = this.mathGrade + this.physicsGrade + this.chemistryGrade;
        return sum/3;
    }

    public static void main(String[] args){
        Student st1 = new Student("Mati", 100, 80, 90);
        Student st2 = new Student("Luna", 69, 100, 95);
        Student st3 = new Student("Vampirito", 100, 85, 60);
        Student st4 = new Student("Halley", 90, 95, 80);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(st1);
        listOfStudents.add(st2);
        listOfStudents.add(st3);
        listOfStudents.add(st4);

        System.out.println("-------------------");
        System.out.println("Before ordering...");
        listOfStudents.forEach((Student student) -> System.out.println(student.toString()));
//        for (Student student: listOfStudents) System.out.println(student.toString());
//        Collections.sort(listOfStudents, (student1, student2) -> student2.totalMark() - student1.totalMark());
        listOfStudents.sort((student1, student2) -> student2.totalMark() - student1.totalMark());

        System.out.println("-------------------");
        System.out.println("After ordering...");
//        for (Student student: listOfStudents) System.out.println(student.toString());
        listOfStudents.forEach((Student student) -> System.out.println(student.toString()));
        System.out.println("\n~~~~~~~~~~~~The best student is: ~~~~~~~~~~~~~~~");
        System.out.println(listOfStudents.get(0).toString());
    }
}
