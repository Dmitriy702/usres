package com.pazuzu.usres.controllers;

import com.pazuzu.usres.models.Contact;
import com.pazuzu.usres.models.Person;
import com.pazuzu.usres.sevices.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public String findAll(Model model) {
        List<Person> persons = personService.findAll();
        model.addAttribute("persons", persons);
        return "person-list";
    }

    @GetMapping("/person-create")
    public String createUserForm(Person person) {
        return "person-create";
    }

    @PostMapping("/person-create")
    public String saveUser(Person person) {
        person.setContact(new Contact());
        personService.personSave(person);
        return "redirect:/persons";
    }

    @GetMapping("person-delete/{id}")
    public String deletePerson(@PathVariable("id") Long id) {
        personService.deleteById(id);
        return "redirect:/persons";
    }
    @GetMapping("/person-update/{id}")
    public String updatePersonForm(@PathVariable("id") Long id, Model model){
        Person person = personService.findById(id);
        model.addAttribute("person", person);
        return "person-update";
    }
    @PostMapping("/person-update")
    public String updatePerson(Person person){
       personService.personSave(person);
        return "redirect:/persons";
    }
}
