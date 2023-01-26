package Teacher;

public class FullTime extends Teacher {
    private int yearsOfExperience;
    private String department;

    public FullTime(String name, int age, int officeNumber, String subject, int yearsOfExperience, String department) {
        super(name, age, officeNumber, subject);
        this.yearsOfExperience = yearsOfExperience;
        this.department = department;
    }

    public FullTime(String name, int officeNumber, String subject, int yearsOfExperience, String department) {
        super(name, officeNumber, subject);
        this.yearsOfExperience = yearsOfExperience;
        this.department = department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
