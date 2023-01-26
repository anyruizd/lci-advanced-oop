public class Car extends Vehicle {
    private boolean isLuxury;

    public Car(String myColor, String model, int year, int numOfDoor, double price) {
        super(myColor, model, year, numOfDoor, price);
    }

    public boolean isLuxury() {
        return isLuxury;
    }

    public void setLuxury(boolean luxury) {
        isLuxury = luxury;
    }

    public boolean isLuxuryCar (Car c) {
        return c.getPrice() > 100000;
    }

    public boolean isClassicCar (Car c) {
        return c.getYear() < 1960;
    }

    public String carType (Car c) {
        String type = "";
        if(c.isClassicCar(c)) {
            type = "Classic";
        }
        if (c.isLuxuryCar(c)) {
            type = "Luxury";
        }
        return type;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "mercedes", 2001, 4, 90000);
        c.carType(c);
    }
}
