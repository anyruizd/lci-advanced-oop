public class Hospital {
    private String name;
//    private final String name = "SunLife Hospital";
    private Address address;
    private String phone;

    public Hospital(String name, Address address, String phone) {
//        this.name = "SunLife Hospital";
        this.name = name;
        this.address = address;
        this.phone = phone;
        seHospitalName();
    }

    public String getName() {
        return name;
    }

    public void seHospitalName() {
        this.name = "SunLife Hospital";
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
