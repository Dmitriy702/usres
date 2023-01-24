package com.pazuzu.usres.sevices;

import com.pazuzu.usres.models.Address;
import com.pazuzu.usres.models.Person;
import com.pazuzu.usres.repositorys.AddressRepository;
import com.pazuzu.usres.repositorys.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository=addressRepository;
    }

    public Address addressSave(Address address) {
        return addressRepository.save(address);
    }

    public Address findById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        addressRepository.deleteById(id);
    }
}
