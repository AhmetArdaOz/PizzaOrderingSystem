package com.example.pizza;



public class Customer {
    private String name;
    private String street;
    private String city;
    private String zipcode;

    public Customer(String name, String street, String city, String zipcode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getName() {
        return this.name;
    }
    public String getStreet() {
        return this.street;
    }
    public String getCity() {
        return this.city;
    }
    public String getZipcode() {
        return this.zipcode;
    }

}
