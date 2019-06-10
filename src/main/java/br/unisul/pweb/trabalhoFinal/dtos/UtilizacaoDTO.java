package br.unisul.pweb.trabalhoFinal.dtos;

import java.io.Serializable;
import br.unisul.pweb.trabalhoFinal.domain.Funcionario;
import br.unisul.pweb.trabalhoFinal.domain.Utilizacao;
import br.unisul.pweb.trabalhoFinal.domain.Veiculo;

public class UtilizacaoDTO implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String nomeFuncionario;
	private String veiculo;
	private int data;
	private int hora;
	private double kmInicial;
	private double kmFinal;
	
	private Funcionario funcionario;
	
	private Veiculo vl;
	
	public UtilizacaoDTO() {
		
	}
	
	public UtilizacaoDTO(Utilizacao u) {
		id = u.getId();
		veiculo = u.getVeiculo();
	}
	
	public UtilizacaoDTO(Veiculo MarcaModelo,Funcionario nomeFun, int dt,int hr, double kmIn, double kmFin) {
		super();
		this.veiculo = MarcaModelo.toString();
		this.nomeFuncionario = nomeFun.getNome();
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
	
	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	
	
	///*
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Veiculo getVeiculos() {
		return vl;
	}

	public void setVeiculos(Veiculo veiculos) {
		this.vl = veiculos;
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
		UtilizacaoDTO other = (UtilizacaoDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
