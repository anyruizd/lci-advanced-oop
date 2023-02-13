public abstract class MyAbstract {
    // the keyword abstract is important
    // In oop abstraction is defined as hiding the unnecessary information or details
    // I create name of method + arguments or parameters, but I do not implement
    // Implementing the function is detail.
    // Our goal is to reduce the complexity
    // Add keyword abstract to the class

    public abstract int getNumber(int a, int b); // abstract method, if i remove the abstract, i need to implement the method -> func { code }
   /* public abstract int getNumber(int a, int b) {
        implementation goes here
    } */

    public abstract int getSum (int c, int d); // just the signature of the function

    // non abstract method
    public void show() {
        System.out.println("\nThis is a non-abstract method in abstract class");
    }
}


