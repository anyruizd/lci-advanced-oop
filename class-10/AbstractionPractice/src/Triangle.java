public class Triangle extends Shape {
    public double calculateArea (double base , double height) {
        return (base * height)/2;
    }

    public double calculatePerimeter (double sideA, double sideB) {
        return 2*(sideA + sideB);
    }
}
