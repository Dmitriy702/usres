package com.pazuzu.usres.models;

import com.pazuzu.usres.models.contact.EMail;
import com.pazuzu.usres.models.contact.PhoneNumber;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name = "CONTACT")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
//    @OneToOne(mappedBy = "contact")
//    private Person person;
    @OneToMany(mappedBy = "contact")
    private Set<PhoneNumber> telNumbers;
    @OneToMany(mappedBy = "contact")
    private Set<EMail> eMails;

}
