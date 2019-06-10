package br.unisul.pweb.trabalhoFinal.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unisul.pweb.trabalhoFinal.domain.Veiculo;
import br.unisul.pweb.trabalhoFinal.repositories.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository rep;
	
	//BUSCAR POR ID
	public Veiculo find (Integer id) {
	 Optional<Veiculo> obj = rep.findById(id);
	 return obj.orElse(null);
	}

	//INSERIR
	public Veiculo insert (Veiculo obj) {
	 obj.setId(null);
	 return rep.save(obj);
	}

	//ATUALIZAR
	public Veiculo update (Veiculo obj) {
	 find(obj.getId());
	 return rep.save(obj);
	}

	//DELETAR
	public void delete (Integer id) {
	 find(id);
	 rep.deleteById(id);
	}
	
	/*
	//LISTAR TODAS
		 public List<Veiculo> findAll(){
			 // return rep.findAll();
			 return rep.findAllByOrderByNome();
		 }
	*/
}
