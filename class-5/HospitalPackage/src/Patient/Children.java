package Patient;
import Doctor.Family;
import Doctor.Pediatric;
public class Children extends Patient {
    private double weight;
    private Family familyDoctor;
    public Children(String name, double weight, Family familyDoctor) {
        super(name);
        this.weight = weight;
        this.familyDoctor = familyDoctor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Family getFamilyDoctor() {
        return familyDoctor;
    }

    public void setFamilyDoctor(Family familyDoctor) {
        this.familyDoctor = familyDoctor;
    }

    public static void main(String[] args) {
        Pediatric pt = new Pediatric(400000, "12345678");
        Family familyDoctor = new Family(320000, "H3H1K4");
        Children c = new Children("Any", 50, familyDoctor);
    }
}
