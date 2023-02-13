public abstract class Shape {
    // number of sides
    // value of the side
    // abstract method to calculate area and perimeter
    public abstract double calculateArea (double sideA , double sideB); // just the signature of the function
    public abstract double calculatePerimeter (double sideA, double sideB); // just the signature of the function

    public void show(double d) {
        System.out.println("The result is " + d);
    }

}
