package com.pazuzu.usres.repositorys;

import com.pazuzu.usres.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
