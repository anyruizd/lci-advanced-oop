public class Vehicle {
    private String color;
    private String model;
    private int year;
    private int numOfDoor;
    private double price;

    public Vehicle () {}



    // overloading!
    public Vehicle (String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }
    public Vehicle (String myColor, String model, int year, int numOfDoor, double price) {
        this.color = myColor;
        this.model = model;
        this.year = year;
        this.numOfDoor = numOfDoor;
        this.price = price;

    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getNumOfDoor() {
        return numOfDoor;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumOfDoor(int numOfDoor) {
        this.numOfDoor = numOfDoor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return (this.color +""+this.model+""+this.year);
    }
}
