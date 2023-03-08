public class Main {
    public static void main(String[] args) {
        int[] arrayNumber = {1,2,3,4};
        String[] classmates = {"Prachi", "Riya", "Malav", "Thiago", "Inna", "Jean-Michel", "Oleks", "Supraja", "Keerthana", "Jeel", "Adit", "Pratham", "Matthew", ""};
        for(int i = 0; i < classmates.length; i++) {
            System.out.println(i + ": " + classmates[i]);
        }
        System.out.println();
        System.out.println("For each example");
        System.out.println();
        for(String item : classmates){
            System.out.println(" Using foreach");
            System.out.println(item);
        }
    }
}