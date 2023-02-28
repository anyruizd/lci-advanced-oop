import java.time.LocalDateTime;

public class Staff extends Person {
    private String education;
    private String certification;
    private String languages;

    public Staff() {
    }

    public Staff(String education, String certification, String languages) {
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }

    public Staff(String givenName, String familyName, LocalDateTime birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate);
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
}
