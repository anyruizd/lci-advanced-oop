public class Mammal {
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("All mammals can run");
    }
}
