public class MySingleton {
    // Singleton is not a class, is a design pattern
    // Initialize my object from my class
    private static MySingleton instance; // this is a global variable
//    private static MySingleton instance;
    public String name = "";
    // private constructor
    private MySingleton() {}
    // when i load the class into memory all the static variables that have an initial value, 
    // are called and initialized -> eager approach or eager initialization asap initialiation
    // private static instance = new Singleton();
    public static MySingleton getInstance() {
        if(instance == null) { // we check if it already exists in heap memory, its useful to create DB connections
            // If i create the instance when i call the getInstance, it's called lazy singleton
            // this does the initialization as late as possible
            instance = new MySingleton(); // i already declared instance at the top
        }
        return instance;
    }

    
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance();
        singleton.name = "John Doe";
        System.out.println(singleton.name);

        MySingleton singleton2 = MySingleton.getInstance();
        System.out.println(singleton2.name);
    }
}
