import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
//        String text = "I am a student";
//        String text1 = new String("holi");
//        int length = text.length();
//        System.out.println(length);
        /*
        * 1. Check email contains @ return message to user "your email should contain @" or you're good. Thanks
        * 2. I want to clean the data before inject to db avoiding whitespace,@,.,-,_,\,/
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email to be validated: ");
        String email = sc.nextLine();
        System.out.println(email);

        boolean matchFound = Pattern.matches("@", email);
        System.out.println("matchFound: " + matchFound);

        if(matchFound) {
            System.out.println("You're good, thanks!");
        } else {
            System.out.println("Your email should contain @");
        }

        String text = " Hello @ . i_have three-kitties \"he i'm jokingggg /  ";
        System.out.println(text);
        String text1 = text.trim();
        System.out.println(text1);
        String text2 = text1.replaceAll("[,;?@'.^/*\"()%_-]", "");
        System.out.println(text2);


    }
}