import java.time.LocalDateTime;

public class OperationsStaff extends Staff {
    public OperationsStaff() {
    }

    public OperationsStaff(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public OperationsStaff(String givenName, String familyName, LocalDateTime birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
