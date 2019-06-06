package br.unisul.pweb.trabalhoFinal.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilizacao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id //chave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY) //auto encremento
	private Integer id;
	
	private String nomeFuncionario;
	private int data;
	private int hora;
	private double kmInicial;
	private double kmFinal;
	
	/*@OneToMany(mappedBy="funcionario")
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	@OneToMany(mappedBy="veiculo")
	private List<Veiculo> veiculos = new ArrayList<>();
	*/
	public Utilizacao() {
		
	}
	
public Utilizacao(String nomeFun, int dt,int hr, double kmIn, double kmFin) {
		this.nomeFuncionario = nomeFun;
		this.data = dt;
		this.hora = hr;
		this.kmInicial = kmIn;
		this.kmFinal = kmFin;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public double getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}
	public double getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
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
		Utilizacao other = (Utilizacao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
