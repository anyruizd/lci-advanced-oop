public class Main {
    public static void main(String[] args) {
        Monster golbin = new Monster("Golbin", 55, 10);
        Monster orge = new Monster("Orge", 55, 10);

        Battle myBattle = new Battle();
        myBattle.battle(orge, golbin);
    }
}