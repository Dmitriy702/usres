package com.pazuzu.usres.controllers;

import com.pazuzu.usres.models.Address;
import com.pazuzu.usres.sevices.AddressService;
import com.pazuzu.usres.sevices.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddressController {

    private final AddressService addressService;
    private final PersonService personService;
    private Long idPerson;

    @Autowired
    public AddressController(AddressService addressService, PersonService personService) {
        this.addressService = addressService;
        this.personService = personService;
    }

    @GetMapping("/address/{id}")
    public String findById(@PathVariable("id") Long id, Model model) {

        if (null==personService.findById(id).getAddress()){  // Почему personService.findById(id).getAddress()==null даёт NPE а наоборот нет??? годы злости!!!
            idPerson=id;
            return "address-not-found";
        }
        else {
            Address address = personService.findById(id).getAddress();
            model.addAttribute("address", address);
            return "address-for-person";
        }

    }

    @GetMapping("/address-create")
    public String createAddressForm(Address address) {
        return "address-create";
    }

    @PostMapping("/address-create")
    public String saveAddress(Address address) {
        personService.findById(idPerson).setAddress(address);//  что то подсказывает мне что так делать нельзя но как сделать лучше я не придумал :(
        addressService.addressSave(address);
        return "redirect:/persons";
    }
//
//    @GetMapping("person-delete/{id}")
//    public String deletePerson(@PathVariable("id") Long id) {
//        personService.deleteById(id);
//        return "redirect:/persons";
//    }
//
//    @GetMapping("/person-update/{id}")
//    public String updatePersonForm(@PathVariable("id") Long id, Model model) {
//        Person person = personService.findById(id);
//        model.addAttribute("person", person);
//        return "person-update";
//    }
//
//    @PostMapping("/person-update")
//    public String updatePerson(Person person) {
//        personService.personSave(person);
//        return "redirect:/persons";
//    }
}
