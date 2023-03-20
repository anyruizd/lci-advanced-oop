public class Tower {
    public static int numMoves = 0;
    public static void tower(int ndisks, char from, char to, char aux) {

        if(ndisks == 0) {
            return;
        }
        // Move first disk
        tower(ndisks - 1, from, aux, to);
        System.out.println("Move disk " + ndisks + " from " + from + " to " + to);
        tower(ndisks - 1, aux, to, from);
        numMoves++;
    }

    public static void main(String[] args) {
        tower(3, 'A', 'C', 'B');
        System.out.println("Number of moves: " + numMoves);
    }
}
