package com.tech2seniors.workshopmongo.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech2seniors.workshopmongo.domain.Sujestao;
import com.tech2seniors.workshopmongo.services.SujestaoService;

@RestController
@RequestMapping(value = "/sujestoes")
public class SujestaoResource {
	
	@Autowired
	private SujestaoService service;

	@GetMapping("/{id}")
	public ResponseEntity<Sujestao> findById(@PathVariable String id) {
		Sujestao obj = service.findById(id);
		return ResponseEntity.ok().body(obj); 
	}
}


