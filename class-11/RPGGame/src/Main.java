public class Main {
    public static void main(String[] args) {
        Monster golbin = new Monster("Golbin", 25, 100);
        Monster orge = new Monster("Orge", 35, 80);

        Battle myBattle = new Battle();
        myBattle.battle(golbin, orge);
    }
}