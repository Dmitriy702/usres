package com.pazuzu.usres.models.contact;

import com.pazuzu.usres.models.Contact;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "PHONE_NUMBER")
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "NUMBER")
    private String number;

    @ManyToOne
    @JoinColumn(name = "CONTACT_ID")
    private Contact contact;
}
