public class Main {
//    int age = 42;
    public static void writeName() {
//        name = "Mary"; // we don't have access to name here
        int age = 32;
        System.out.println(age);
    }
    public static void main(String[] args) {
        // local
        String name;
        name = "Any";
        int age = 32;
        System.out.println("Hello " + name + "! :)" + age);
        writeName();
        // Primitive
        boolean hello = true;
        System.out.println(hello);
        char hello2 = 'C';
        System.out.println(hello2);
        int sun = 23;
        System.out.println(sun);
        long sunsote = 432432434;
        System.out.println(sunsote);

        double doble = 12.5;
        System.out.println(doble);

    }
}

/* OOP
* Before it was procedural oriented programming
* In OOP I create a class (blueprint) with properties, attributes, fields, functions
* I have a constructor that builds the object for me (from the blueprint).
* The object I create is the same as the blueprint.
*
*/