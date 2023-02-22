import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class GameManager {
    private int battleDuration = 50;
    public LocalDateTime startTime = LocalDateTime.now();
    List<Monster> listOfMonsters = new ArrayList<Monster>();

    public int getBattleDuration() {
        return battleDuration;
    }

    public boolean isGameOver() {
        return listOfMonsters.size() == 1;
    }

    public boolean isTimeOut(LocalDateTime startTime) {
        Duration duration = Duration.between(startTime, LocalDateTime.now());
        return duration.toMillis() >= this.getBattleDuration();
    }

    public int getRandomIndex() {
        return RandomNumberGenerator.getInstance().nextInt(0, listOfMonsters.size());
    }

    public void battle() {
        int round = 1;
        while(!isGameOver() && !isTimeOut(startTime)) {
            System.out.println("------------- Battle Round " + round + " -------------");
            int fighterIndex = getRandomIndex();
            int targetIndex;
            do {
                targetIndex = getRandomIndex();
            } while(fighterIndex == targetIndex);

            Monster target = listOfMonsters.get(targetIndex);
            Monster fighter = listOfMonsters.get(fighterIndex);

            System.out.println("Fighter: \n" + fighter.toString());
            System.out.println("Target: \n" + target.toString());

            while(!fighter.isHurt() && !target.isHurt()) {
                if(fighter.isLucky()) {
                    fighter.boostState();
                }
                fighter.attackTarget(target);
                if(target.isHurt()) {
                    listOfMonsters.remove(target);
                    System.out.println(fighter.getName() + " wins the DUAL FIGHT");
                    break;
                }
                Monster temp = fighter;
                fighter = target;
                target = temp;
            }

            round++;
        }

        System.out.println("**************** LIST OF WINNERS ****************");
        for(Monster obj : listOfMonsters) {
            System.out.println(obj.getName() + " win the battle");
        }
    }

    public void startGame() {
        Monster monster1 = new Monster("vampirito", 100, 100, 50);
        Monster monster2 = new Monster("halley", 80, 120, 80);
        Monster monster3 = new Monster("matilda", 50, 80, 25);
        Monster monster4 = new Monster("luna", 45, 70, 100);
        listOfMonsters.add(monster1);
        listOfMonsters.add(monster2);
        listOfMonsters.add(monster3);
        listOfMonsters.add(monster4);
    }
}
