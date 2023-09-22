package com.tech2seniors.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.tech2seniors.workshopmongo.domain.Sujestao;
import com.tech2seniors.workshopmongo.domain.User;
import com.tech2seniors.workshopmongo.repository.SujestaoRepository;
import com.tech2seniors.workshopmongo.repository.UserRepository;

@Configuration
public class instantiation implements CommandLineRunner {
	
	@Autowired
	private SujestaoRepository SujestaoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		SujestaoRepository.deleteAll();
		
		User bob = new User(null, "bob@gmail.com");
		
		Sujestao sujestao1 = new Sujestao(null, sdf.parse("21/03/2014"), "Eu quero que tenha no app blablabla", bob);
		
		SujestaoRepository.saveAll(Arrays.asList(sujestao1));
		
		
		
	}

}
