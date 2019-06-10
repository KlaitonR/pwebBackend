package br.unisul.pweb.trabalhoFinal.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.unisul.pweb.trabalhoFinal.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepositoryImplementation<Funcionario, Integer>{
	
	/*
		 @Transactional(readOnly=true)
			public List<Funcionario> findAllByOrderByNome();
	*/
}
