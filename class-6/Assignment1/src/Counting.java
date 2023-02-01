/*

Create a file called Counting.java, and in this file, declare a class called Counting. This program takes as input from the user (using args) a positive integer and counts up until that number. eg:
> run Counting 10
I am counting until 10: 1 2 3 4 5 6 7 8 9 10
*
* */
import java.util.Scanner;
public class Counting {
    public static void count (int num) {
        System.out.print("I am counting until " + num + ": ");
        for(int i = 0; i < num; i++) {
            System.out.print(i + 1 + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to count: ");
        int number = sc.nextInt();
        count(number);
    }
}
