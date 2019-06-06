package br.unisul.pweb.trabalhoFinal.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import br.unisul.pweb.trabalhoFinal.domain.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepositoryImplementation<Veiculo, Integer>{

}