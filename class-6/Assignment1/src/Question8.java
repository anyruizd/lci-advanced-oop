import java.util.Scanner;

/*
*   Write a method alphaString() which takes two Strings as input and returns the String between the two that
    comes first in the alphabet. For example, alphaString("banana", "apple") returns the String "apple", while
    alphaString("snake", "squirrel") returns the String "snake".
*
* */
public class Question8 {
    public static String alphaString (String str1, String str2) {
        return str1.compareToIgnoreCase(str2) < 0 ? str1 : str2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        System.out.println(alphaString(str1, str2));
    }
}
