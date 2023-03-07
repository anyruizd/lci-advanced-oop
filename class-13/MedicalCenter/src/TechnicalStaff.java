import java.util.Date;

public class TechnicalStaff extends Staff {
    public TechnicalStaff() {
    }

    public TechnicalStaff(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public TechnicalStaff(String givenName, String familyName, Date birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }


}
