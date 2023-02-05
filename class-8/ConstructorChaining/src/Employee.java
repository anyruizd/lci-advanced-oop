public class Employee {
    public String empName;
    public int salary;
    public String city;

    public CompanyAddress workAddress;

    // Constructor chaining in java
    //  In class i have several constructors, when I call one constructor in another constructor
    // it means i'm chaining the constructor
    /*
    * Constructor is a function
    * I can call a function inside another function
    * the this keyword should be in the first line in the constructor, is the
    * */
    public Employee () {
        //default constructor
        this("Any");
    }

    public Employee (String empName) {
        this(empName, 25000);
//        this.empName = empName;
    }

    public Employee (String empName, int salary) {
        this(empName, salary, "Montreal", new CompanyAddress());
//        this.empName = empName;
//        this.salary = salary;
    }

    public Employee (String empName, int salary, String city, CompanyAddress workAddress) {
        this.empName = empName;
        this.salary = salary;
        this.city = city;
        this.workAddress = workAddress;
    }

    public void display() {
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("City: " + city);
    }
}
