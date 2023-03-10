import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Date birthdate = new Date(1990, 1, 1);
        Teacher t1 = new Teacher("John", birthdate, "john@gm.c", 30);
        Teacher t2 = new Teacher("Rose", birthdate, "rose@asas.c", 30);
        Teacher t3 = new Teacher("Alice", birthdate, "alice@ff.c", 30);
        Teacher t4 = new Teacher("Bob", birthdate, "bob@sdd.c", 30);

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);

        if(teachers.isEmpty()){
            System.out.println("No teachers");
        } else {
            System.out.println("There are " + teachers.size() + " teachers:");
            for (Teacher teacher : teachers) {
                System.out.println("------------------");
                System.out.println(teacher.toString());
            }
        }
    }
}