package com.example.bookLibrary.entity;

public class LenderEntity {
    private String name;
    private String surname;
    // private AddressEntity address;

    public LenderEntity() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }
}
