public class SuperState extends IState {
    private static SuperState instance;
    private SuperState () {};

    public static SuperState getInstance() {
        if(instance == null) {
            instance = new SuperState();
        }
        return instance;
    }

    public void attack(Monster fighter, Monster target) {
        int injury = RandomNumberGenerator.getInstance().nextInt(fighter.ap, fighter.ap*2);
        target.receiveHurt(injury);
        if(target.isHurt()){
            fighter.boostState();
        }
    }

    public void booster(Monster fighter) {
        fighter.ap += 10;
        fighter.setPwMax(fighter.getPwMax() + 15);
    }
}
