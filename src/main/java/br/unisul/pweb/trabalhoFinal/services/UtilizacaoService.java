package br.unisul.pweb.trabalhoFinal.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.unisul.pweb.trabalhoFinal.domain.Utilizacao;
import br.unisul.pweb.trabalhoFinal.repositories.UtilizacaoRepositoty;

@Service
public class UtilizacaoService {

	
	@Autowired
	private UtilizacaoRepositoty rep;

	//BUSCAR POR ID
	public Utilizacao find (Integer id) {
	 Optional<Utilizacao> obj = rep.findById(id);
	 return obj.orElse(null);
	}

	//INSERIR
	public Utilizacao insert (Utilizacao obj) {
	 obj.setId(null);
	 return rep.save(obj);
	}

	//ATUALIZAR
	public Utilizacao update (Utilizacao obj) {
	 find(obj.getId());
	 return rep.save(obj);
	}

	//DELETAR
	public void delete (Integer id) {
	 find(id);
	 rep.deleteById(id);
	}
}
