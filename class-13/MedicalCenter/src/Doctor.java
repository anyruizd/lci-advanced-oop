import java.time.LocalDateTime;

public class Doctor extends OperationsStaff {
    public Doctor() {
    }

    public Doctor(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public Doctor(String givenName, String familyName, LocalDateTime birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
