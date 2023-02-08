public class Account {
    private static Account account;
    private String accountName;

    private Account (){}; // access specifier

    public static Account getInstance (){
        if(account == null){
            account = new Account();
        }
        return account;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void getAccountInfo () {
        System.out.println("Your " + getAccountName() + " account was created!");
    }
}
