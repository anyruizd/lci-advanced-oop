import java.util.Scanner;
public class Question9 {
    public static String replaceAll(String input, char ch1, char ch2) {
        return input.replaceAll(Character.toString(ch1), Character.toString(ch2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        System.out.print("Enter the first character: ");
        char ch1 = sc.next().charAt(0);
        System.out.print("Enter the second character: ");
        char ch2 = sc.next().charAt(0);
        System.out.println(replaceAll(input, ch1, ch2));
    }
}
