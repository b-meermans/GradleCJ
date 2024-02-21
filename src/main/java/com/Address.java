package com;

public class Address {
    private int num;
    private String street;
    private String zip;
    private String city;
    private State state;

    public Address(int num, String street, String city, State state, String zip) {
        this.num = num;
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getNum() {
        return num;
    }

    public String getStreet() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }
}
