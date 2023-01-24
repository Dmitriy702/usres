package com.pazuzu.usres.controllers;

import com.pazuzu.usres.models.Person;
import com.pazuzu.usres.models.contact.PhoneNumber;
import com.pazuzu.usres.sevices.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PhoneNumberController {
    @Autowired
    private final PhoneNumberService phoneNumberService;

    public PhoneNumberController(PhoneNumberService phoneNumberService) {
        this.phoneNumberService = phoneNumberService;
    }
    @PostMapping("/create-number")
    public void createPerson(PhoneNumber phoneNumber){
        phoneNumberService.savePhoneNumber(phoneNumber);
    }


}
