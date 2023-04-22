package com.example.myfirstjavaeeproject.Model;

public class User {
    private int id;
    private String name;
    private String email;
    private Address address;
    static int idCounter = 0;

    public User() {
        this.id = idCounter++;
    }

    public User(int id, String name, String email, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        // TODO: How to add address to user in the database
        this.address = address;

    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
