package Especies.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

@Entity
@Table(name="individuos")
public class IndividuoBean {

	@Id
	@Column
	private long codigo;
	
	@Column
	private int peso;
	
	@Column
	private String dimensiones;
	
	@ManyToOne
	@JoinColumn(name="CodEspecie")
	private EspecieBean especie;

	public EspecieBean getEspecie() {
		return especie;
	}

	public void setEspecie(EspecieBean especie) {
		this.especie = especie;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	
	
	
}
