public class Car extends Vehicle {
    private int speed;
    public Car() {
        super(); // inheritance: I'm calling the constructor of my super class
    };
    public Car(int speed) {
        super();
        this.speed = speed;
    };

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static void main(String[] args)
    {
        Car c = new Car();
        c.setColor("White");
        System.out.println(c.getColor());

        Car c2 = new Car(300);
        c2.setModel("BMW");

        System.out.println(c2.getModel()); // I have access to this property via the encapsulation
        c.color = "Black";
        System.out.println(c.color);

    }
}
