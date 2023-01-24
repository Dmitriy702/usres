package com.pazuzu.usres.models;

import com.pazuzu.usres.enums.Sex;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "PERSON")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "LASTNAME")
    private String lastname;
    @Column(name = "AGE")
    private int age;
    @Column(name = "BIRTHDAY")
    private LocalDate birthday;
    @Column(name = "SEX")
    private Sex sex;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTACT_ID", referencedColumnName = "ID")
    private Contact contact;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "FRIENDSHIP",
            joinColumns = {@JoinColumn(name = "FRIEND_1")},
            inverseJoinColumns = {@JoinColumn(name = "FRIEND_2")})
    private Set<Person> friends;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID", referencedColumnName = "ID")
    private Address address;
}