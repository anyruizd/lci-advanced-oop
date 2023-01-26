public class Truck extends Vehicle {
    private String sound;
    private int speed;

    private boolean isTotalLoss;
    public Truck(String myColor, String model, int year, int numOfDoor, double price, String sound, int speed) {
        super(myColor, model, year, numOfDoor, price);
        this.sound = sound;
        this.speed = speed;
    }

    public Truck () {}

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isTotalLoss(Truck t) {
        return isTotalLoss = t.getYear() < 2000;
    }

    public boolean isTotalLoss() {
        return isTotalLoss;
    }

    public void setTotalLoss(boolean totalLoss) {
        isTotalLoss = totalLoss;
    }

    // if the car model is less than 2000 = total lost, else repairable
    public String stateOfCar(Truck t) {
        String message = "";
        if(t.isTotalLoss(t)) {
            message = "Dear owner of " + t.getModel() + " " + t.getYear() + ". Your car is total loss";
        } else {
            message = "Dear owner of " + t.getModel() + " " + t.getYear() + ". Your car is repairable";
        }
        return message;
    }

    public static void main(String[] args) {
        Truck t = new Truck("red", "mercedes", 2001, 4, 90000, "jdksdjkld", 245);
        System.out.println(t.stateOfCar(t));
    }
}
