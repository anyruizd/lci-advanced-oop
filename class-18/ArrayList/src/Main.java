import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> original = Arrays.asList("Hello", "Bonjour", "Salam", "Namaste");
        // First way
        List<String> clonedList = new ArrayList<String>(original);
        System.out.println(clonedList);

        // Second way -> create empty list and add original one
        List<String> clonedList2 = new ArrayList<String>();
        clonedList2.addAll(original);

        // ArrayList
        // LinkedList -> they are linear, based on nodes,
        // Each object has information about the next node (pointer)

        // In the list interface we have vector: it has all the legacy methods
        Vector<String> listOfStudent = new Vector<String>();
        listOfStudent.add("Any");
        listOfStudent.add("Adit");
        listOfStudent.add("Jeel");
        System.out.println("Before ordering...");
        for (String name: listOfStudent) System.out.println(name);
        Collections.sort(listOfStudent);
        System.out.println("After ordering...");
        for (String name: listOfStudent) System.out.println(name);

        Vector<String> listOfPlants = new Vector<String>();
        listOfPlants.add("Tulip");
        listOfPlants.add("Sunflower");
        listOfPlants.add("Snake plant");
        listOfPlants.add("Rose");
        System.out.println("-------------------");
        System.out.println("Before ordering...");
        for (String name: listOfPlants) System.out.println(name);
        Collections.sort(listOfPlants);
        System.out.println("-------------------");
        System.out.println("After ordering...");
        for (String name: listOfPlants) System.out.println(name);

        Collections.sort(listOfPlants, Collections.reverseOrder());

        System.out.println("-------------------");
        System.out.println("After ordering descending order...");
        for (String name: listOfPlants) System.out.println(name);
        System.out.println("-------------------");
        System.out.println("Comparator result: ");
        // Comparator -> it will compare based on my parameters
        Collections.sort(listOfPlants, new Comparator<String>() {
            @Override
            public int compare(String plant1, String plant2) {
                return plant1.compareTo(plant2);
            }
        });
        for (String name: listOfPlants) System.out.println(name);

        System.out.println("-------------------");
        System.out.println("Comparator result 2: ");
        // Comparator -> it will compare based on my parameters
        Collections.sort(listOfPlants, new Comparator<String>() {
            @Override
            public int compare(String plant1, String plant2) {
                return plant2.compareTo(plant1); // reverse order
            }
        });
        for (String name: listOfPlants) System.out.println(name);

        // lambda version
        List<String> favLanguages = Arrays.asList("Javascript", "Python", "English", "Spanish", "French");
        Collections.sort(favLanguages, (lang1, lang2) -> lang1.compareTo(lang2));
        System.out.println("Compare with lambda lang1 to lang2");
        for (String name: favLanguages) System.out.println(name);
        // Collections sort:
        /*
        * 1. objects are equal -> 0
        * 2.
        * */
    }
}