import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student std1 = new Student(1, "luna", 10);
        Student std2 = new Student(2, "vampirito", 8);
        Student std3 = new Student(3, "halley", 5);
        Student std4 = new Student(1, "matilda", 5);

        List<Student> myStdL = new ArrayList<Student>();

        myStdL.add(std1);
        myStdL.add(std2);
        myStdL.add(std3);
        myStdL.add(std4);
//        myStdL.addAll(std1,std2,std3,std4); // This doesn't work, it has to be a collection
        System.out.println(myStdL.size());
        if(myStdL.isEmpty()){
            System.out.println("The list is empty, add objects!");
        } else {
            System.out.println("***********************");
            // using the list.get method
            for(int i = 0; i < myStdL.size(); i++) {
                System.out.println(myStdL.get(i).toString());
            }
            System.out.println("***********************");
            // doing the casting to array
            for(int i = 0; i < myStdL.toArray().length; i++) {
                System.out.println(myStdL.toArray()[i].toString());
            }
            System.out.println("***********************");
            for (Student st: myStdL) { // this casts the list to an array
                System.out.println(st.toString());
            }
        }

        if(!myStdL.isEmpty()){
            System.out.println("**********?*************");
            for (int i = 0; i < myStdL.size(); i++) {
               if(myStdL.get(i).getName() == "luna") {
                   myStdL.remove(i);
                   break;
               }
                System.out.println(myStdL.get(i).toString());
            }
            System.out.println(myStdL.size());
        }
        for (Student st : myStdL) {
            System.out.println(st.toString());
        }

        if(myStdL.contains(std2)){
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
        System.out.println("********* Linked list *********");
        LinkedList<Student> myListofSts = new LinkedList<Student>();
        myListofSts.add(std1);
        myListofSts.add(std2);
        myListofSts.add(std3);
        myListofSts.add(std4);
        myListofSts.addFirst(std1);
//        myListofSts.getFirst().
        for (Student st: myListofSts) {
            System.out.println(st);
        }
        System.out.println("********* -- *********");
    }
}