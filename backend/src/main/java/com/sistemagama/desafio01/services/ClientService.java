package com.sistemagama.desafio01.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistemagama.desafio01.dto.ClientDTO;
import com.sistemagama.desafio01.entities.Client;
import com.sistemagama.desafio01.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();
		List<ClientDTO> listDto = list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
		return listDto;
	}
}
