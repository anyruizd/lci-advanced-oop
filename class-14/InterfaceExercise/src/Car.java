public class Car implements Vehicle, FourWheels {
    public void makeSound(){
        System.out.println("Brrrbbrrr i'm a carr");
    }
    public void getType() {
        System.out.println("Type: Car");
    }

    public void printWheels () {
        System.out.println("Four wheels");
    }
}
