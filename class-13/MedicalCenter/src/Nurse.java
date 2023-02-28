import java.time.LocalDateTime;

public class Nurse extends OperationsStaff {
    public Nurse() {
    }

    public Nurse(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public Nurse(String givenName, String familyName, LocalDateTime birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
