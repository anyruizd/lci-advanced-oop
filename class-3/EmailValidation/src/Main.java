import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static boolean checkAt(String email) {
        Pattern pattern = Pattern.compile("@", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }
    public static boolean checkDomainName(String email) {
        Pattern pattern = Pattern.compile(".com", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public static boolean validateEmail(String email) {
        return checkAt(email) && checkDomainName(email);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email: ");
        String email = sc.nextLine();

        boolean isValid = validateEmail(email);
        if(isValid) {
            System.out.println("Email is valid!");
        } else {
            System.out.println("Email is not valid");
        }
    }
}