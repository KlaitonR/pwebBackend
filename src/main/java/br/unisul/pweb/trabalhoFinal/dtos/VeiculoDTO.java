package br.unisul.pweb.trabalhoFinal.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import br.unisul.pweb.trabalhoFinal.domain.Utilizacao;
import br.unisul.pweb.trabalhoFinal.domain.Veiculo;

public class VeiculoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	private int ano;
	private String placa;
	private String marca;
	private String modelo;
	@JsonIgnore
	private List<Utilizacao> utilizacoes = new ArrayList<>();
	
	public VeiculoDTO() {
		
	}
	
	public VeiculoDTO(Veiculo v) {
		id = v.getId();
		ano = v.getAno();
		placa = v.getPlaca();
		marca = v.getMarca();
		modelo = v.getMarca();
		utilizacoes = v.getUtilizacoes();
	}
	
	public VeiculoDTO (int ano,String placa,String marca,String modelo) {
		super();
		this.ano = ano;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String toString() {
		return this.marca + " - " + this.modelo;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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
		VeiculoDTO other = (VeiculoDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
