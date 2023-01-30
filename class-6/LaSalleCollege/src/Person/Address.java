package Person;

public class Address {
    private String streetNumber;
    private String streetName;
    private String unitNumber;

    private String city;
    private String postalCode;
    public Address() {}

    public Address(String streetNumber, String streetName, String unitNumber) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.unitNumber = unitNumber;
    }

    public Address(String streetNumber, String streetName, String unitNumber, String city, String postalCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.unitNumber = unitNumber;
        this.city = city;
        this.postalCode = postalCode;
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

    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String toString() {
        return this.getStreetNumber() + this.getStreetName() + this.getUnitNumber() + this.getPostalCode() + this.getCity();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
