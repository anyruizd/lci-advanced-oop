import java.util.ArrayList;

public class Language {
    private String name;
    private String creator;
    private int yearCreated;
    private String type;

    public Language() {
    }

    public Language(String name, String creator, int yearCreated, String type) {
        this.name = name;
        this.creator = creator;
        this.yearCreated = yearCreated;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Name: " + this.name + "\nCreator: " + this.creator + "\nYear Created: " + this.yearCreated + "\nType: " + this.type;
    }

    public static void main(String[] args){
        Language l1 = new Language("Java", "James Gosling", 1995, "Object-Oriented");
        Language l2 = new Language("Python", "Guido van Rossum", 1991, "Scripting");
        Language l3 = new Language("C#", "Microsoft", 2000, "Object-Oriented");
        Language l4 = new Language("C++", "Bjarne Stroustrup", 1983, "Object-Oriented");
        Language l5 = new Language("JavaScript", "Brendan Eich", 1995, "Scripting");

        ArrayList<Language> languages = new ArrayList<>();
        languages.add(l1);
        languages.add(l2);
        languages.add(l3);
        languages.add(l4);
        languages.add(l5);

        for (Language language : languages) {
            System.out.println("------------------");
            System.out.println(language.toString());
        }

        System.out.println("------------------ Using for loop: ------------------");

        for (int i = 0; i < languages.size(); i++) {
            System.out.println("------------------");
            System.out.println(languages.get(i).toString());
        }

    }
}
