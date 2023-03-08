public class Monster {
    private String name;
    private int hp; // health points
    private int damage;
    private Monster target; // we need two monsters, the one fighting and the other target
    // I can create a property of the type of the same class

    public Monster() {}
    public Monster(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Monster getTarget() {
        return target;
    }

    public void setTarget(Monster target) {
        this.target = target;
    }

    public boolean isDead() {
        return this.hp <= 0;
    }

    public void deadMessage() {
        System.out.println(this.name + " is dead! >.<");
    }

    public void attack() {
        System.out.println(this.name + " having " + this.hp +  " is attacking " + this.target.name + " having " + this.target.hp);
        this.target.hp -= this.damage;

        if(target.isDead()) {
            target.deadMessage();
        }
    }
}
