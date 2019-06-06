package br.unisul.pweb.trabalhoFinal.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.unisul.pweb.trabalhoFinal.services.BdService;

@Configuration
public class DevConfig {

	@Autowired
	private BdService bdService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean inicializaBancoDeDados() throws ParseException {
		if (!"create".equals(strategy)) {
			return false;
		}
		bdService.inicializaBancoDeDados();
		return true;
	}
	
}
