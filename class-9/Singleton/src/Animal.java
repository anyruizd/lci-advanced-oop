public class Animal {
    // apply nested class or inner class
    class Reptile { // non-static
        public void displayInfo () {
            System.out.println("I am a snake reptile type of animal");
        }
    }

    static class Mammal { // static
        public void displayInfo () { // if I add static I cannot access it through object creation,
            // in the instances of the object, we cannot access static methods or variables
            System.out.println("I am a Bear, mammal type of animal");
        }
    }

    public static void main(String[] args){
        Animal animal = new Animal();
        Animal.Reptile cat = animal.new Reptile();
        Animal.Mammal dog = new Animal.Mammal();
    }
}
