import java.util.Scanner;
public class Question7 {
    public static String getFirstHalf (String input) {
        int half = (int)Math.floor(input.length()/2);
        return input.substring(0, half);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        System.out.println(getFirstHalf(input));
    }
}
