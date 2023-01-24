package com.pazuzu.usres.sevices;

import com.pazuzu.usres.models.contact.PhoneNumber;
import com.pazuzu.usres.repositorys.PhoneNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneNumberService {

    private final PhoneNumberRepository phoneNumberRepository;

    @Autowired
    public PhoneNumberService(PhoneNumberRepository phoneNumberRepository) {
        this.phoneNumberRepository = phoneNumberRepository;
    }

    public PhoneNumber savePhoneNumber(PhoneNumber phoneNumber){
        return phoneNumberRepository.save(phoneNumber);
    }
}
