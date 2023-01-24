package com.pazuzu.usres.models.contact;

import com.pazuzu.usres.models.Contact;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "EMAIL")
public class EMail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "EMAIL")
    private String eMail;
    @ManyToOne
    @JoinColumn(name = "CONTACT_ID")
    private Contact contact;
}
