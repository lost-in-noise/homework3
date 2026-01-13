package org.example;

public class Address {
    public String city;
    public String street;

    @Override
    public String toString() {
        return city + ", " + street;
    }
}
