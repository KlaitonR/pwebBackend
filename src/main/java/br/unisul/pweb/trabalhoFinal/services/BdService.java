package br.unisul.pweb.trabalhoFinal.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.trabalhoFinal.domain.Funcionario;
import br.unisul.pweb.trabalhoFinal.domain.Utilizacao;
import br.unisul.pweb.trabalhoFinal.domain.Veiculo;
import br.unisul.pweb.trabalhoFinal.repositories.FuncionarioRepository;
import br.unisul.pweb.trabalhoFinal.repositories.UtilizacaoRepositoty;
import br.unisul.pweb.trabalhoFinal.repositories.VeiculoRepository;

@Service
public class BdService {
	
	@Autowired
	private VeiculoRepository veiRep;
	
	@Autowired 
	private FuncionarioRepository funRep;
	
	@Autowired
	private UtilizacaoRepositoty utiRep;
	
	public void inicializaBancoDeDados() throws ParseException{
		
		Veiculo v1 = new Veiculo(2008,"KSH7880","Toyota","Corola");
		Funcionario f1 = new Funcionario("Klaiton");
		Utilizacao u1 = new Utilizacao("Klaiton", 10062019,1008,10.6,20.7);
		
		veiRep.saveAll(Arrays.asList(v1));
		funRep.saveAll(Arrays.asList(f1));
		utiRep.saveAll(Arrays.asList(u1));
		
	}

}
