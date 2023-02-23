public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car myCar = new Car();
        myCar.printWheels();
        myCar.makeSound();
        myCar.getType();

        Bike myBike = new Bike();
        myBike.getType();
        myBike.makeSound();
        myBike.printWheels();
    }
}