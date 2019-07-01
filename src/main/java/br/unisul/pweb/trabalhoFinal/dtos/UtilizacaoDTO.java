package br.unisul.pweb.trabalhoFinal.dtos;
import java.io.Serializable;
import br.unisul.pweb.trabalhoFinal.domain.Funcionario;
import br.unisul.pweb.trabalhoFinal.domain.Utilizacao;
import br.unisul.pweb.trabalhoFinal.domain.Veiculo;

public class UtilizacaoDTO implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private Integer id;
//	private String nomeFuncionario;
	//private String veiculo;
	private String data;
	private String hora;
	private double kmInicial;
	private double kmFinal;
	Veiculo veiculo;
	Funcionario funcionario;
	
	public UtilizacaoDTO() {
		
	}
	
	public UtilizacaoDTO(Utilizacao u) {
		id = u.getId();
		//veiculo = u.getVeiculo();
		//nomeFuncionario = u.getNomeFuncionario();
		veiculo = u.getVl();
		funcionario = u.getFuncionario();
		data = u.getData();
		hora = u.getHora();
		kmInicial = u.getKmInicial();
		kmFinal = u.getKmFinal();
	}
	
	public UtilizacaoDTO(Veiculo vei,Funcionario fun, String dt,String hr, double kmIn, double kmFin) {
		//Veiculo MarcaModelo,Funcionario nomeFun,
		super();
		//this.veiculo = MarcaModelo.toString();
		//this.nomeFuncionario = nomeFun.getNome();
		this.veiculo = vei;
		this.funcionario = fun;
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
	/*public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
*/
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
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
	/*
	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	*/
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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
