import java.util.Scanner;
public class PrintStars {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int starNumber = sc.nextInt();
        if(starNumber == 0 ){
            System.out.println("No number, no star");
        } else if (starNumber < 0) {
            System.out.println("Number should be greater than zero!");
        } else if (starNumber > 0){
            printStars(starNumber);
            System.out.println("\nThe reversed triangle is: ");
            printReverseStars(starNumber);
        }
    }
    public static void printStars (int n) {
        for (int i = n; i > 0; i--) {
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printReverseStars (int n) {
        for (int i = 0; i <= n; i++) {
            for(int j = n; j>i; j--){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
