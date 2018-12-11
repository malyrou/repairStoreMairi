package com.example.demo.repository;

import com.example.demo.domain.Owner;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OwnerRepository extends JpaRepository<Owner, Long>{

    Optional<Owner> getOwnerByFirstNameAndLastName(String firstName, String lastName);

}




