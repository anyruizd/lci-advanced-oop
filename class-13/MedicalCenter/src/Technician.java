import java.util.Date;

public class Technician extends TechnicalStaff {
    private TechnicianSalary technicianSalary;

    public Technician(String education, String certification, String languages) {
        super(education, certification, languages);
    }

    public Technician(String givenName, String familyName, Date birthdate, String education, String certification, String languages) {
        super(givenName, familyName, birthdate, education, certification, languages);
    }
}
