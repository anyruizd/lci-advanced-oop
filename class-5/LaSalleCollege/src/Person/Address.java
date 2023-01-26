package Person;

public class Address {
    private String streetNumber;
    private String streetName;
    private String unitNumber;

    public Address() {}

    public Address(String streetNumber, String streetName, String unitNumber) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.unitNumber = unitNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }
}
