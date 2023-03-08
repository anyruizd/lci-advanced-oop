public class Vehicle {
    class Car {
        public void engineSound() {
            System.out.println("I am a car: Raaaan raaa raaaan");
        }
    }
    static class Truck {
        public void engineSound() {
            System.out.println("I am a truck: Brrrrruumbruuumbrrruuumm");
        }
    }
    class Motorcycle {
        public void engineSound() {
            System.out.println("I am a motorcycle: Brrrrruuummm brummmmmm");
        }
    }
    static class Boat {
        public void engineSound() {
            System.out.println("I am a boat: Prowwwwnnnn");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(); // this is the outer class

        Vehicle.Car car = vehicle.new Car(); // this is the inner class Car  non-static
        car.engineSound();

        Vehicle.Truck truck = new Vehicle.Truck(); // this is the inner class Truck static
        truck.engineSound();

        Vehicle.Motorcycle motorcycle = vehicle.new Motorcycle(); // this is the inner class Motorcycle non-static
        motorcycle.engineSound();

        Vehicle.Boat boat = new Vehicle.Boat(); // this is the inner class Boat static
        boat.engineSound();
    }

}
