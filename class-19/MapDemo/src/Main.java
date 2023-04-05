import java.util.*;

public class Main {
    /*
     * Map: A map is a collection of key-value pairs called entries.
     * - Key: Is a reference to an object.
     * - Value:
     * Map interface:
     * - Map<K, V> map = new HashMap<>();
     * Java application -> driver -> database
     * Each db has its own driver, download driver, introduce driver to your app, read the file and connect
     *
    * */
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Map<Integer, String> mapFile = new HashMap<Integer, String>();
        // add entry to the map
        mapFile.put(101, "BMW");
        mapFile.put(102, "Tesla");
        mapFile.put(100, "Toyota");

        for (Map.Entry entry: mapFile.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("------------------");
        mapFile.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("------------------");
        mapFile.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        /* I can sort it ascending, descending or alphabetically */
        System.out.println("------------------");

        // Example of map
        Map<String, String> mapFile2 = new HashMap<String, String>();
        mapFile2.put("BMW", "Germany");
        mapFile2.put("Tesla", "USA");
        mapFile2.put("Toyota", "Japan");
        mapFile2.put("Honda", "Japan");
        mapFile2.put("Ford", "USA");

        // Get the value of a key
        System.out.println(mapFile2.get("BMW"));

        // Get the key of a value
        for (Map.Entry entry: mapFile2.entrySet()) {
            if (entry.getValue().equals("Japan")) {
                System.out.println(entry.getKey());
            }
        }

        // Get the key of a value
        for (Map.Entry entry: mapFile2.entrySet()) {
            if (entry.getValue().equals("USA")) {
                System.out.println(entry.getKey());
            }
        }
    }
}