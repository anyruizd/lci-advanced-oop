import java.time.LocalDateTime;

public class AdministrativeStaff extends Staff {
    public AdministrativeStaff() {
    }

    public AdministrativeStaff(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public AdministrativeStaff(String givenName, String familyName, LocalDateTime birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
