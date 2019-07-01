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
		Veiculo v2 = new Veiculo(2009,"HDJ5646","Chevrolet","Onix");
		Veiculo v3 = new Veiculo(2007,"HDJ5646","Fiat","Uno");
		
		veiRep.saveAll(Arrays.asList(v1,v2,v3));
		
		Funcionario f1 = new Funcionario("Klaiton");
		Funcionario f2 = new Funcionario("Kleiton");
		Funcionario f3 = new Funcionario("Funcionário 3");
		Funcionario f4 = new Funcionario("Funcionário 4");
		
		
		funRep.saveAll(Arrays.asList(f1,f2,f3,f4));
		
		Utilizacao u1 = new Utilizacao(v1,f1,"25-11-2018","10:32",16.6,25.7);
		Utilizacao u2 = new Utilizacao(v1,f2,"19-12-2018","07:55",7.8,18);
		Utilizacao u3 = new Utilizacao(v2,f2,"02-01-2019","11:12",11,37.5);
		Utilizacao u4 = new Utilizacao(v2,f1,"07-04-2019","09:25",10.2,20);
		Utilizacao u5 = new Utilizacao(v3,f3,"01-02-2019","16:30",55.2,76);
		Utilizacao u6 = new Utilizacao(v3,f4,"03-02-2019","14:08",76,89.4);
		
		u1.setVl(v1);
		u1.setFuncionario(f1);
		
		u2.setVl(v1);
		u2.setFuncionario(f2);
		
		u3.setVl(v2);
		u3.setFuncionario(f2);
		
		u4.setVl(v2);
		u4.setFuncionario(f1);
		
		u5.setVl(v3);
		u5.setFuncionario(f3);
		
		u6.setVl(v3);
		u6.setFuncionario(f4);
		
		utiRep.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6));
		
		f1.getUtilizacoes().addAll(Arrays.asList(u1,u4));
		f2.getUtilizacoes().addAll(Arrays.asList(u2,u3));
		f3.getUtilizacoes().addAll(Arrays.asList(u5));
		v1.getUtilizacoes().addAll(Arrays.asList(u1,u2));
		v2.getUtilizacoes().addAll(Arrays.asList(u3,u4));	
		v3.getUtilizacoes().addAll(Arrays.asList(u5,u6));
	
	}

}
