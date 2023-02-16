public class HurtState extends IState {
    private static HurtState instance;
    private HurtState() {};

    public static HurtState getInstance() {
        if(instance == null) {
            instance = new HurtState();
        }
        return instance;
    }

    public void attack(Monster fighter, Monster target) {
        System.out.println("I cannot attack, I am hurt! >.<");
    }

    public void booster(Monster fighter) {
        System.out.println("I cannot boost, I am hurt! >.<");
    }
}
