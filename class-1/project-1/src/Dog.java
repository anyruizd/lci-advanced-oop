public class Dog {
    private String name;
    private int age;
    private String breed;
    private String color;

    public Dog (String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    /*
     * encapsulation: you put your variables private and create getters and setters
     * */
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString () {
        return this.getName() + " " + this.getBreed();
    }

    public static void main(String[] args) {
        Dog anyPoppy = new Dog("Vampirito", "Stray", "Gray", 4);
        Dog innaPoppy = new Dog("Nala", "Spain", "Blonde", 7);
        System.out.println(anyPoppy.toString());
        System.out.println(innaPoppy.color);
    }
}
