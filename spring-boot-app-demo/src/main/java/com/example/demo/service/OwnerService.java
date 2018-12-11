package com.example.demo.service;

import com.example.demo.domain.Owner;
import java.util.List;
import java.util.Optional;

public interface OwnerService {
    Optional<Owner> findOwner(Long id);

    List<Owner> getAllOwners();

    Optional<Owner> findOwnerByFirstNameAndLastName(String firstName, String lastName);
}





