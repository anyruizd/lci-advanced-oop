import java.util.Date;

public class Technologist extends TechnicalStaff {
    public Technologist() {
    }

    public Technologist(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public Technologist(String givenName, String familyName, Date birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
