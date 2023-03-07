import java.util.Date;

public class Nurse extends OperationsStaff {
    public Nurse() {
    }

    public Nurse(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public Nurse(String givenName, String familyName, Date birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
