package com.tech2seniors.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech2seniors.workshopmongo.domain.Sujestao;
import com.tech2seniors.workshopmongo.repository.SujestaoRepository;
import com.tech2seniors.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class SujestaoService {

	@Autowired
	private SujestaoRepository repo;

	public Sujestao findById(String id) {
		Optional<Sujestao> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	
}
