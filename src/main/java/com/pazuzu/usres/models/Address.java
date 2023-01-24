package com.pazuzu.usres.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STREET")
    private String street;
    @Column(name = "HOUSE")
    private String house;
    @Column(name = "APARTMENT")
    private String apartment;
    @Column(name = "PERSON_ID")
    private Long personId;
}
