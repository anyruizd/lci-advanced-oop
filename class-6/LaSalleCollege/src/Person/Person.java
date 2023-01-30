package Person;
public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Address ad = new Address("1975", "Maisonneuve Boulevard", "811", "Montreal", "H3H 1K4");
        Person p = new Person("Any", 30, ad);
        System.out.println("*******************");
        System.out.println(p.getAddress());
        System.out.println(p.address.getCity());
    }
}
