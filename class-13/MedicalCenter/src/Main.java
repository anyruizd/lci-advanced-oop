import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Department department = new Department();
        Department.Dermatology dermatology = department.new Dermatology(1, "Dermatology SunLife", 15);
        Department.Endocrinology endocrinology = department.new Endocrinology(2,"Endocrinology SunLife", 20);
        Date birthdate = new Date(1989, 03,23);
        Address address = new Address("Boulevard de Maisonneuve Ouest", "1975", "Montreal", "H#H1K4", "Canada", "811");
        Person p1 = new Person("Doctor", "John", "Doe", birthdate, GenderType.MALE, address, "143222333");
//        givenName, String familyName, Date birthdate, String education, String certification, String languages
        Doctor dr1 = new Doctor("vampirito", "ruiz", birthdate, "Medicine", "Star", "french");
        Doctor dr2 = new Doctor("halley", "ruiz", birthdate, "Medicine", "Star", "english");
        Doctor dr3 = new Doctor("luna", "ruiz", birthdate, "Medicine", "Star", "french");
        Doctor dr4 = new Doctor("halley", "ruiz", birthdate, "Medicine", "Star", "french");
        List<Doctor> drList = new ArrayList<Doctor>();
        drList.add(dr1);
        drList.add(dr2);
        drList.add(dr3);
        drList.add(dr4);

        for(Doctor dr : drList) {
            System.out.println(dr.toString());
        }
    }
}