import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Department department = new Department();
        Department.Dermatology dermatology = department.new Dermatology(1, "Dermatology SunLife", 15);
        Department.Endocrinology endocrinology = department.new Endocrinology(2,"Endocrinology SunLife", 20);
        Date birthdate = new Date(1989, 03,23);
        Address address = new Address("Boulevard de Maisonneuve Ouest", "1975", "Montreal", "H#H1K4", "Canada", "811");
        Person p1 = new Person("Doctor", "John", "Doe", birthdate, GenderType.MALE, address, "143222333");
        
    }
}