import java.util.ArrayList;

public class Plant {
    private String name;
    private String type;
    private String color;
    private double heightInCm;

    public Plant() {
        }

    public Plant(String name, String type, String color, int heightInCm) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.heightInCm = heightInCm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return this.heightInCm;
    }

    public void setHeight(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public String toString() {
        return "Name: " + this.name + "\nType: " + this.type + "\nColor: " + this.color + "\nHeight: " + this.heightInCm;
    }

    public static void main(String[] args) {
        Plant p1 = new Plant("Rose", "Flower", "Red", 10);
        Plant p2 = new Plant("Tulip", "Flower", "Yellow", 15);
        Plant p3 = new Plant("Snake plant", "Succulent", "Green", 20);
        Plant p4 = new Plant("Sunflower", "Flower", "Yellow", 25);

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(p1);
        plants.add(p2);
        plants.add(p3);
        plants.add(p4);

        if(plants.isEmpty()){
            System.out.println("No plants");
        } else {
            System.out.println("There are " + plants.size() + " plants:");
            for (Plant plant : plants) {
                System.out.println("------------------");
                System.out.println(plant.toString());
            }
            System.out.println("------------------ Using for loop: ------------------");
            for(int i = 0; i < plants.size(); i++) {
                System.out.println("------------------");
                System.out.println(plants.get(i).toString());
            }

            // I want to remove the snake plant from the list
            for(Plant p : plants) {
                if(p.getName().equals("Snake plant")) plants.remove(p);
            }
            System.out.println("Now there are " + plants.size() + " plants");
            System.out.println("Clone of the list with plants.clone()");
            ArrayList<Plant> clone = (ArrayList<Plant>) plants.clone();
        }
    }
}
