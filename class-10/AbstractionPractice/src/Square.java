public class Square extends Shape {

    public double calculateArea (double sideA , double sideB) {
        return sideA * sideB;
    }

    public double calculatePerimeter (double sideA, double sideB) {
        return 2*(sideA + sideB);
    }
}
