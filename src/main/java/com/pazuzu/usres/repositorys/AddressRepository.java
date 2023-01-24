package com.pazuzu.usres.repositorys;

import com.pazuzu.usres.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
