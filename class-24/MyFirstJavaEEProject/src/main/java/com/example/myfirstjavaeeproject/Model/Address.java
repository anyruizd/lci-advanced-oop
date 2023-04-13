package com.example.myfirstjavaeeproject.Model;

public class Address {
    private int unit;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address() {
    }

    public Address(int unit, String street, String city, String state, String zip) {
        this.unit = unit;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getId() {
        return unit;
    }

    public void setId(int id) {
        this.unit = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
