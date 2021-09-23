package com.sistemagama.desafio01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemagama.desafio01.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
