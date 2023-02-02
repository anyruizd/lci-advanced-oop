import java.util.Scanner;
public class Question6 {
    public static void count (int num, int step) {
        if (step > num ) {
            System.out.println("Error! Step size should be smaller than the number!");
        } else {
            System.out.print("I am counting until " + num + " with a step size of " + step + ": ");
            for (int i = step; i < num; i = i + step) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to count: ");
        int number = sc.nextInt();
        System.out.print("Enter the step: ");
        int step = sc.nextInt();
        count(number, step);
    }
}
