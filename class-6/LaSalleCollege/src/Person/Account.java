package Person;

public class Account {
    private String accountNumber;
    private String branchNumber;
    private String institutionName;

    public Account(String accountNumber, String branchNumber, String institutionName) {
        this.accountNumber = accountNumber;
        this.branchNumber = branchNumber;
        this.institutionName = institutionName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(String branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String toString () {
        return this.getInstitutionName() + this.getBranchNumber() + this.getAccountNumber();
    }
}