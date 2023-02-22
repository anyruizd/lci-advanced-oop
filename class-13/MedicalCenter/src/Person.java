import java.time.LocalDateTime;

enum GenderType {
    FEMALE,
    MALE,
    NON_BINARY,
    OTHER
}

public class Person {
    private String title;
    private String givenName;
    private String familyName;
    private LocalDateTime birthdate;
    private GenderType gender;
    private Address address;
    private String phone;

    public Person() {
    }

    public Person(String givenName, String familyName, LocalDateTime birthdate) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.birthdate = birthdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public LocalDateTime getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDateTime birthdate) {
        this.birthdate = birthdate;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        String info = "Full name: " + this.familyName + " " + this.givenName +
                      "\nTitle: " + this.title +
                      "\nBirthdate: " + this.birthdate.getYear() + "/" + this.birthdate.getDayOfMonth() + "/" + this.birthdate.getMonth() +
                      "\nGender: " + this.gender +
                      "\nAddress: " + this.getAddress();

        return info;
    }
}
