public class Address {
    public String streetName;
    public String streetNumber;
    public String city;
    public String postalCode;
    public String country;
    public String unitNumber;

    public Address(String streetName, String streetNumber, String city, String postalCode, String country, String unitNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.unitNumber = unitNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String toString() {
        String addressText = "";
        addressText += getUnitNumber() + "#" + getStreetNumber() + " " + getStreetName();
        addressText += getCity() + ", " + getCountry();

        return addressText;
    }
}
