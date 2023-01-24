package com.pazuzu.usres.sevices;

import com.pazuzu.usres.models.Person;
import com.pazuzu.usres.repositorys.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person personSave(Person person) {
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        List<Person> list = personRepository.findAll();
        System.out.println(list.toString());
        return list;
    }

    public Person findById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
