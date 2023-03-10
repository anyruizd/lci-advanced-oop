import java.util.Date;

public class Teacher {
    private String name;
    private Date birthDate;
    private String email;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, Date birthDate, String email, int age) {
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + "\nBirthdate: " + birthDate + "\nEmail: " + email + "\nAge: " + age;
    }
}
