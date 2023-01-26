package Patient;
import Doctor.Family;
import Doctor.Pediatric;
public class Children extends Patient {
    private double weight;

    public Children(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Pediatric pt = new Pediatric(400000, "12345678");
        Family f = new Family(320000, "H3H1K4");
    }
}
