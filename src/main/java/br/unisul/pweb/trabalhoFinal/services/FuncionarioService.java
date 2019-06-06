package br.unisul.pweb.trabalhoFinal.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.trabalhoFinal.domain.Funcionario;
import br.unisul.pweb.trabalhoFinal.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository rep;

	//BUSCAR POR ID
	public Funcionario find (Integer id) {
	 Optional<Funcionario> obj = rep.findById(id);
	 return obj.orElse(null);
	}

	//INSERIR
	public Funcionario insert (Funcionario obj) {
	 obj.setId(null);
	 return rep.save(obj);
	}

	//ATUALIZAR
	public Funcionario update (Funcionario obj) {
	 find(obj.getId());
	 return rep.save(obj);
	}

	//DELETAR
	public void delete (Integer id) {
	 find(id);
	 rep.deleteById(id);
	}

}
