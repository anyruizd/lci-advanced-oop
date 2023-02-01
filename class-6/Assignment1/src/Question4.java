/*
* Question 4
Let’s write a method incrementally:
1. Start by writing a method called getRandomNumber that takes no inputs,and returns a random double between 0 (included) and 10 (excluded).
2. Now,modify it so that it returns a random int between 0 and 10 (still excluded).
3. Finally,let the method take two integers min and max as inputs,and return a random integer greater than or equal to min and less than max.
* */
import java.lang.Math;
public class Question4 {
    public static int getRandomNumber (int min, int max) {

        return (int)(Math.random() * (max - min) + min);
    }
    public static void main(String[] args) {
        System.out.println(getRandomNumber(0,5));
    }
}
