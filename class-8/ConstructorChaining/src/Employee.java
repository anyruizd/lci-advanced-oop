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
        this("John Doe", 2500, "Montreal", new CompanyAddress());
    }

    public Employee (String empName) {
        this(empName, 2500, "Montreal", new CompanyAddress());
    }

    public Employee (String empName, int salary) {
        this(empName, salary, "Montreal", new CompanyAddress());
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

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.display();

        Employee emp2 = new Employee("John Doe");
        emp2.display();

        Employee emp3 = new Employee("John Doe", 2500);
        emp3.display();

        Employee emp4 = new Employee("John Doe", 2500, "Montreal", new CompanyAddress());
        emp4.display();
    }
}
