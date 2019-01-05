package com.example.bookLibrary.entity;

import javax.persistence.*;

@Entity
@Table(name = "lender")
public class LenderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    // private AddressEntity address;

    public LenderEntity() {

    }

    private long getId() {
        return id;
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
