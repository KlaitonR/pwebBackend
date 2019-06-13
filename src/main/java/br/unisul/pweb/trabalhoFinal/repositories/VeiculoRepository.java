package br.unisul.pweb.trabalhoFinal.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.unisul.pweb.trabalhoFinal.domain.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepositoryImplementation<Veiculo, Integer>{

	@Transactional(readOnly=true)
	public List<Veiculo> findAllByOrderById();
}
