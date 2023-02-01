import java.util.Scanner;

/*
* Question 6
For this question you have to generalize the last question. The user will give you the number they want the computer to count up to and the step size by which it will do so.
> run Counting 25 3
I am counting to 25 with a step size of 3:
*/
public class Question6 {
    public static void count (int num, int step) {
        if (step > num ) {
            System.out.println("Error! Step size should be smaller than the number!");
        } else {
            System.out.print("I am counting until " + num + " with a step size of " + step + ": ");
            for (int i = 0; i < num; i = i + step) {
                System.out.print(i + 1 + " ");
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
