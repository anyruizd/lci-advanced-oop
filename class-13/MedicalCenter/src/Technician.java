import java.time.LocalDateTime;

public class Technician extends TechnicalStaff {
    private TechnicianSalary technicianSalary;

    public Technician(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public Technician(String givenName, String familyName, LocalDateTime birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
