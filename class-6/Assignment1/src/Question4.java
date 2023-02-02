import java.lang.Math;
import java.util.Scanner;

public class Question4 {
    public static int getRandomNumber (int min, int max) {
        return (int)(Math.random() * (max - min) + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the min number: ");
        int min = sc.nextInt();
        System.out.print("Enter the max number: ");
        int max = sc.nextInt();
        System.out.println("Random number between " + min + " and " + max + ": " + getRandomNumber(0,10));
    }
}
