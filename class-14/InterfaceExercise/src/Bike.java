public class Bike implements Vehicle, TwoWheel {

    public void getType() {
        System.out.println("Type: Bike");
    }

    public void makeSound() {
        System.out.println("uueeeuueee");
    }

    public void printWheels(){
        System.out.println("Two wheels");
    }
}
