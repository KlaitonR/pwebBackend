package br.unisul.pweb.trabalhoFinal.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import br.unisul.pweb.trabalhoFinal.domain.Funcionario;
import br.unisul.pweb.trabalhoFinal.domain.Utilizacao;

public class FuncionarioDTO implements Serializable{

private static final long serialVersionUID = 1L;
	private Integer id;
	
	private String nome;
	
	private List<Utilizacao> utilizacoes = new ArrayList<>();
	
	
	public FuncionarioDTO() {
		
	}
	
	public FuncionarioDTO(Funcionario f) {
		id = f.getId();
		nome = f.getNome();
	}
	
	public FuncionarioDTO(String nome) {
		super();
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Utilizacao> getUtilizacoes() {
		return utilizacoes;
	}

	public void setUtilizacoes(List<Utilizacao> utilizacoes) {
		this.utilizacoes = utilizacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncionarioDTO other = (FuncionarioDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
