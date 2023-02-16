public class NormalState extends IState{
    private static NormalState instance; // 1. create a private instance field

    private NormalState() {} // 2. create private constructor

    public static NormalState getInstance() { // 3. create access to the private instance field
        if(instance == null) {
            instance = new NormalState();
        }
        return instance;
    }

    public void attack(Monster fighter, Monster target) {
        int injury = RandomNumberGenerator.getInstance().nextInt(0, fighter.ap);
        target.receiveHurt(injury);
        if(target.isHurt()) {
            fighter.boostState();
        }
    }

    public void booster(Monster fighter) {
        fighter.ap += 10;
        fighter.setPwMax(fighter.getPwMax() + 15);
        fighter.setCurrentState(SuperState.getInstance());
    }
}
