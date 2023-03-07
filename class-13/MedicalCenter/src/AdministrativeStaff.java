import java.util.Date;

public class AdministrativeStaff extends Staff {
    public AdministrativeStaff() {
    }

    public AdministrativeStaff(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public AdministrativeStaff(String givenName, String familyName, Date birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
