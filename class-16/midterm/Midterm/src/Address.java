public class Address {
    private String streetName;
    private int civilNumber;
    private String city;
    private String province;
    private String postalCode;
    private int unit;

    public Address() {
    }

    public Address(String streetName, int civilNumber, String city, String province, String postalCode, int unit) {
        this.streetName = streetName;
        this.civilNumber = civilNumber;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.unit = unit;
    }

    public Address(String streetName, String city, String province, String postalCode) {
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getCivilNumber() {
        return civilNumber;
    }

    public void setCivilNumber(int civilNumber) {
        this.civilNumber = civilNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String toString() {
        String details = "";
        details += this.unit + "#" + this.civilNumber + " " + this.streetName;
        details += this.postalCode + " ";
        details += this.city + "," + this.province;
        return details;
    }
}
