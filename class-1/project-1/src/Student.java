public class Student {
    String name;
    String email;
    int studentId;

    int age;
    static String jobTitle;
    public Student () {
        this.name = "Diego";
        this.email = "diego@gmail.com";
        this.age = 22;
        this.jobTitle = "student";
    }
    public static void main(String[] args) {
        Student st1 = new Student(); // st1 is the instance variable
        // If I try to use the st1.jobTitle you can not use it from an
        // instance, only in the class. I can only access it in my class.
    }
}
