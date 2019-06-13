package br.unisul.pweb.trabalhoFinal.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		Veiculo v2 = new Veiculo(2008,"HDJ5646","Chevrolet","Onix");
		
		veiRep.saveAll(Arrays.asList(v1,v2));
		
		Funcionario f1 = new Funcionario("Klaiton");
		Funcionario f2 = new Funcionario("Kleiton");
		
		funRep.saveAll(Arrays.asList(f1,f2));
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
		
		Utilizacao u1 = new Utilizacao(v1,f1,data.parse("25/11/2018"),hora.parse("10:32"),10.6,20.7);
		Utilizacao u2 = new Utilizacao(v1,f2,data.parse("19/12/2018"),hora.parse("10:32"),10.6,20.7);
		Utilizacao u3 = new Utilizacao(v2,f2,data.parse("02/01/2019 null:null"),hora.parse("10:32"),10.6,20.7);
		Utilizacao u4 = new Utilizacao(v2,f1,data.parse("7/04/2019"),hora.parse("10:32"),10.6,20.7);
		
		u1.setVl(v1);
		u1.setFuncionario(f1);
		
		u2.setVl(v1);
		u2.setFuncionario(f2);
		
		u3.setVl(v2);
		u3.setFuncionario(f2);
		
		u4.setVl(v2);
		u4.setFuncionario(f1);
		
		utiRep.saveAll(Arrays.asList(u1,u2,u3,u4));
		
		f1.getUtilizacoes().addAll(Arrays.asList(u1,u4));
		f2.getUtilizacoes().addAll(Arrays.asList(u2,u3));
		v1.getUtilizacoes().addAll(Arrays.asList(u1,u2));
		v2.getUtilizacoes().addAll(Arrays.asList(u3,u4));	
	
	}

}
