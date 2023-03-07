import java.util.Date;

public class FrontDeskStaff extends AdministrativeStaff {
    public FrontDeskStaff() {
    }

    public FrontDeskStaff(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public FrontDeskStaff(String givenName, String familyName, Date birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
