package com.pazuzu.usres.repositorys;

import com.pazuzu.usres.models.contact.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {
}
