import java.util.Scanner;
public class Counting {
    public static void count (int num) {
        System.out.print("I am counting until " + num + ": ");
        for(int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to count: ");
        int number = sc.nextInt();
        count(number);
    }
}
