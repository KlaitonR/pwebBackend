package br.unisul.pweb.trabalhoFinal.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id //chave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(length=5) 
	private Integer id;
	
	@Column( length=50) 
	private String nome;
	
	///*
	@JsonIgnore
	@OneToMany(mappedBy="funcionario")
	private List<Utilizacao> utilizacoes = new ArrayList<>();
	//*/
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome) {
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

	///*
	
	public List<Utilizacao> getUtilizacoes() {
		return utilizacoes;
	}

	public void setUtilizacoes(List<Utilizacao> utilizacoes) {
		this.utilizacoes = utilizacoes;
	}
	
	//*/

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
		Funcionario other = (Funcionario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
