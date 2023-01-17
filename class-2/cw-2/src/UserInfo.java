import java.util.Scanner;

public class UserInfo {
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first name: ");
            String firstName = sc.nextLine();
            System.out.print("Enter the last name: ");
            String lastName = sc.nextLine();
            System.out.print("Enter the email: ");
            String email = sc.nextLine();
            System.out.print("Enter the phone number: ");
            int phoneNumber = sc.nextInt();
            System.out.print("Enter the age: ");
            int age = sc.nextInt();

            System.out.println("\nFirst name: " + firstName + "\nLast name: " + lastName + "\nEmail: " + email + "\nPhone number: " + phoneNumber + "\nAge: " + age);
        }
}
