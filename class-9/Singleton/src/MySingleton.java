public class MySingleton {
    // Singleton is not a class, is a design pattern
    // Initialize my object from my class
    private static MySingleton instance; // this is a global variable
//    private static MySingleton instance;
    public String name = "";
    // private constructor
    private MySingleton() {}

    public static MySingleton getInstance() {
        if(instance == null) { // we check if it already exists in heap memory, its useful to create DB connections
            instance = new MySingleton(); // i already initialized instance at the top
        }
        return instance;
    }
}
