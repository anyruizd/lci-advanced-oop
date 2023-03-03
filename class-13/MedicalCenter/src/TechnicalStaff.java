import java.time.LocalDateTime;

public class TechnicalStaff extends Staff {
    public TechnicalStaff() {
    }

    public TechnicalStaff(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public TechnicalStaff(String givenName, String familyName, LocalDateTime birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }


}
