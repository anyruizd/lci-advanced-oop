public class Question3 {
    public  static boolean processInts (int x, int y, int z) {
        return z == 3 || z == x + y;
    }
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int z = 3;
        processInts(x, y, z);
        System.out.println("The result is " + processInts(x, y, z));
        x = 3;
        y = 4;
        z = 7;
        processInts(x, y, z);
        System.out.println("The result is " + processInts(x, y, z));
        x = 3;
        y = 4;
        z = 8;
        processInts(x, y, z);
        System.out.println("The result is " + processInts(x, y, z));
    }
}
