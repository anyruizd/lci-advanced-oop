/*
* Question 1
    Write a method swap which takes as input two int values x and y. Your method should do 3 things:
    * 1. Print the value of x and y
    * 2. Swap the values of the variables x and y,so that what ever was in x is now in y and whatever was in y is now in x
    * 3. Print the value of x and y again.
    For example, if your method is called as follows: swap(3,4) the effect of calling your method should be the
    following printing
    inside swap: x is:3 y is:4 inside swap: x is:4 y is:3
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 3;
        int y = 4;

        swap(x,y);

        System.out.println("After swap: ");
        System.out.println("x is: " + x + ", y is: " + y);
        // They are the same because we passed the variables values, not the references
        // so the x and y the function swap is changing are different from the ones defined in the main
    }

    public static void swap (int x, int y) {
        System.out.println("x is: " + x + ", y is: " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x is: " + x + ", y is: " + y);
    }
}