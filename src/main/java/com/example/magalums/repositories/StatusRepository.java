package com.example.magalums.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.magalums.entities.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
