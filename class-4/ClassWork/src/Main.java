/*
* variables: global/local, instance and abstract
* heap memory: part of the memory created when the app is running, i can have access to the classes
* created while running the application
* When you create an object, inside the heap memory you create an instance of the whole class not
* only the methods or properties alone.
* Reference memory with a specific place in the memory, when we call it we point to the reference
* String something = "something" -> we create a reference variable from the class String
* Same as: String something = new String("something")
* in csharp it was only a data type
* When we declare variable String we're creating a reference variable, and we are store it in the heap memory
*
* */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        for(int i = 0; i < 50; i++) {
            if(i == 10 || i == 11){ continue; }
            System.out.println(i + " ");
        }
    }
}