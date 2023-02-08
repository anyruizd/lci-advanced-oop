public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MySingleton mySingleton = MySingleton.getInstance();
        MySingleton myFavoriteStudent1 = MySingleton.getInstance();
        myFavoriteStudent1.name = "Alex";
        MySingleton myFavoriteStudent2 = MySingleton.getInstance();
        myFavoriteStudent2.name = "Riya";

        System.out.println(myFavoriteStudent1.name);
        System.out.println(myFavoriteStudent2.name); // It's gonna be Riya since i cannot have two differents at the same time

        System.out.println("##########################3");
        DataBase db = DataBase.getInstance();
        db.getDataBase();

        System.out.println("##########################3");
        Account acc = Account.getInstance();
        acc.setAccountName("Checking");
        acc.getAccountInfo();

        System.out.println("##########################3");
        Animal animal = new Animal();
        Animal.Reptile reptile = animal.new Reptile(); // ojo non-static
        reptile.displayInfo();

        System.out.println("##########################3");
        Animal.Mammal mammal = new Animal.Mammal(); // static
        mammal.displayInfo();

        System.out.println("##########################3");
        Vehicle vehicle = new Vehicle();
        Vehicle.Truck truck = new Vehicle.Truck(); // static
        Vehicle.Car car = vehicle.new Car(); // non-static
        Vehicle.Boat boat = new Vehicle.Boat();
        Vehicle.Motorcycle moto = vehicle.new Motorcycle();

        truck.engineSound();
        car.engineSound();
        boat.engineSound();
        moto.engineSound();
    }
}