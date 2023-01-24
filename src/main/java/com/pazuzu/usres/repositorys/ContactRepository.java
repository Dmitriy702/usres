package com.pazuzu.usres.repositorys;

import com.pazuzu.usres.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
