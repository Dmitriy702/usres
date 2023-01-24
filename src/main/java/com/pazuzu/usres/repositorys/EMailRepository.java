package com.pazuzu.usres.repositorys;

import com.pazuzu.usres.models.contact.EMail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EMailRepository extends JpaRepository<EMail, Long> {
}
