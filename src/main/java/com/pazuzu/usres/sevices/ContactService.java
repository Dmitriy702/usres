package com.pazuzu.usres.sevices;

import com.pazuzu.usres.models.Contact;
import com.pazuzu.usres.models.Person;
import com.pazuzu.usres.repositorys.ContactRepository;
import com.pazuzu.usres.repositorys.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

//    public Person personSave(Person person) {
//        return personRepository.save(person);
//    }
//
//    public List<Person> findAll() {
//        List<Person> list = personRepository.findAll();
//        System.out.println(list.toString());
//        return list;
//    }

    public Contact findById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }

//    public void deleteById(Long id) {
//        personRepository.deleteById(id);
//    }
}
