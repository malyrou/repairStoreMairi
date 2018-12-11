package com.example.demo.service;

import com.example.demo.domain.Owner;
import com.example.demo.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public List<Owner> getAllOwners() {
        return ownerRepository.findAll();

    }

    @Override
    public Optional<Owner> findOwner(Long id) {
        return ownerRepository.findById(id);
    }

    @Override
    public Optional<Owner> findOwnerByFirstNameAndLastName(String firstName, String lastName) {
        return ownerRepository.getOwnerByFirstNameAndLastName(firstName, lastName);
    }
}

