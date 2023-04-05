public class Main {
    /*
     * Aggregation is when I have an object of one class inside another class.
     * Examples:
     * - Customer and Address.Both of them are different classes, but Customer has an object of type Address inside.
     * - Account and Customer. A customer has an account.
     *
     * Polymorphism is when
     * - I have inheritance, multilevel inheritance, and interfaces.
     * - I have a method in the parent class that is overridden in the child class.
     * - The ability of a class to provide different implementations of a method
     * - Same function name, different implementation.
     *
     * Map: A map is a collection of key-value pairs called entries.
     * - Key: Is a reference to an object.
     * - Value:
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // This is the normal way of doing it
        Mammal mammal = new Mammal("Mammal");
        Animal animal = new Animal("Animal", 1);
        Dog dog = new Dog("Dog", 2, "Breed");

        // This is the polymorphic way of doing it
        Mammal mammal2 = new Animal("Whale", 500);
        Animal animal2 = new Dog("Dog", 2, "Breed");

        mammal2.run(); // All animals can walk
        animal2.run(); // All dogs can run

        // In polymorphism the only thing allowed to change is the implementation of the funciton
    }
}