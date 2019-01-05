package com.example.bookLibrary.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "zip_code")
    private String zipCode;

    public AddressEntity() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long getId(){
        return id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }
}
