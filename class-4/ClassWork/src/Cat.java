import java.util.Objects;

public class Cat {
    private String name;
    private String breed;
    private boolean isVaccinated;
    private int entertainmentAmount;
    private int age;
    public Cat () {}
    public Cat (String name, String breed, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }
    public boolean needsVaccination (Cat c) {
        return c.age >= 1 && !c.isVaccinated;
    }
    public void makeSound (String breed) {
        if(Objects.equals(breed, "Tabby")) {
            System.out.println("Beow beow!");
        } else if (Objects.equals(breed, "Russian blue")) {
            System.out.println("mew mew!");
        } else {
            System.out.println("Meow!");
        }
    }
    private boolean needsToPlay (Cat c) {
        return c.entertainmentAmount < 100;
    }

    public void play (Cat c) {
        do {
            if (c.needsToPlay(c)) {
                c.entertainmentAmount = c.entertainmentAmount + 10;
                System.out.println("Your cat " + c.name + " is playing!!, still needs to play " + (100 - c.entertainmentAmount ) + " times");
            } else {
                System.out.println("Your cat " + c.name + " doesn't need to play anymore!");
            }
        }
        while(c.needsToPlay(c));

    }
    public static void main(String[] args) {
        Cat cat = new Cat("Vampirito", "Russian blue", 3);
        cat.makeSound("Tabby");
        String message = cat.needsVaccination(cat) ? "Please, vaccine your cat" : "Yay, your cat is vaccinated!";
        System.out.println(message);

        cat.play(cat);
        Cat cat2 = new Cat("Halley", "Tabby", 3);
        cat2.entertainmentAmount = 100;
        cat2.play(cat2);
    }
}