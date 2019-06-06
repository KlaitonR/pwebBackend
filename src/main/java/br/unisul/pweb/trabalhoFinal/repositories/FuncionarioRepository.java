package br.unisul.pweb.trabalhoFinal.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import br.unisul.pweb.trabalhoFinal.domain.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepositoryImplementation<Funcionario, Integer>{

}
