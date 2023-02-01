public class Question1_2 {
    public static void swap (int x, int y) {
        System.out.println("x is: " + x + ", y is: " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x is: " + x + ", y is: " + y);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 3;
        int y = 4;

        swap(x,y);

        System.out.println("After swap: ");
        System.out.println("x is: " + x + ", y is: " + y);
        // Answer: They are the same because we passed the variables values, not the references
        // so the x and y the function swap is changing are different from the ones defined in the main
    }
}
