public class Battle extends Monster {
    public Battle() {
        super();
    }

    public void battle(Monster monster1, Monster monster2) {
        System.out.println(monster1.getName() + " VS " + monster2.getName());
        monster1.setTarget(monster2);
        monster2.setTarget(monster1);
        Monster attacker = new Monster();
        attacker = monster1;

        while(!attacker.getTarget().isDead()){ // I'm going to attack while target is not dead
            attacker.attack();
            attacker = (attacker.getTarget().isDead() ? attacker : attacker.getTarget());
        }
        System.out.println(attacker.getName() + " is Winner! ");
        // If I lose I'm going to give the title of attacker to my target
        // Who is attacker is going to be the one that wins the game
    }
}
