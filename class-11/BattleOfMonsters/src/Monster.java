public class Monster {
    private String name;
    private IState currentState;
    private int pwMax;

    public int pw;
    public int ap;
    public int luck;

    public Monster () {}
    public Monster(String name, int pw, int ap, int luck) {
        this.name = name;
        this.pw = pw;
        this.ap = ap;
        this.luck = luck;
        this.pwMax = pw;
        this.currentState = NormalState.getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPwMax() {
        return pwMax;
    }

    public void setPwMax(int pwMax) {
        this.pwMax = pwMax;
    }

    public IState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }

    public void receiveHurt(int injury) {
        this.pw -= injury;
        System.out.println(this.getName() + " received " + injury + " of damage!");
        if(pw <= 0) {
            if(this.currentState instanceof NormalState) {
                this.currentState = HurtState.getInstance();
                System.out.println(this.getName() + " is Dead! >.<");
            } else if (this.currentState instanceof SuperState) {
                this.currentState = NormalState.getInstance();
                this.heal();
            }
        }
    }

    public boolean isLucky() {
        int randomNumber = RandomNumberGenerator.getInstance().nextInt(0, 100);
        return (randomNumber < this.luck);
    }

    public boolean isHurt() {
        return (this.currentState instanceof HurtState);
    }

    public void attackTarget(Monster target) {
        this.currentState.attack(this, target); // this here represents the object of the class
    }

    public void boostState() {
        this.currentState.booster(this);
    }

    public void heal() {
        this.pw = this.pwMax;
    }

    public String toString() {
        String state;
        if (this.currentState instanceof NormalState) {
            state = "Normal";
        } else if (this.currentState instanceof SuperState) {
            state = "Super";
        } else {
            state = "Hurt";
        }
        String details = "Name: " + this.name +
                         "\nHp: " + this.pw +
                         "\nHpMax: " + this.pwMax +
                         "\nLuck: " + this.luck +
                         "\nState: " + state;
        return details;
    }
}
