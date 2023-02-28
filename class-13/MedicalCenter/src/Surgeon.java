import java.time.LocalDateTime;

public class Surgeon extends Doctor {
    public Surgeon() {
    }

    public Surgeon(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public Surgeon(String givenName, String familyName, LocalDateTime birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
