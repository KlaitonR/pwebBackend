package br.unisul.pweb.trabalhoFinal.dtos;
import java.io.Serializable;
import java.util.Date;
import br.unisul.pweb.trabalhoFinal.domain.Funcionario;
import br.unisul.pweb.trabalhoFinal.domain.Utilizacao;
import br.unisul.pweb.trabalhoFinal.domain.Veiculo;

public class UtilizacaoDTO implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nomeFuncionario;
	private String veiculo;
	private Date data;
	private Date hora;
	private double kmInicial;
	private double kmFinal;
	
	public UtilizacaoDTO() {
		
	}
	
	public UtilizacaoDTO(Utilizacao u) {
		id = u.getId();
		veiculo = u.getVeiculo();
		nomeFuncionario = u.getNomeFuncionario();
		data = u.getData();
		hora = u.getHora();
		kmInicial = u.getKmInicial();
		kmFinal = u.getKmFinal();
	}
	
	public UtilizacaoDTO(Veiculo MarcaModelo,Funcionario nomeFun, Date dt,Date hr, double kmIn, double kmFin) {
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
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
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
