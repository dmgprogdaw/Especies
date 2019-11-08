package Especies.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="individuos")
public class IndividuoBean {

	@Id
	@Column
	private long codIndividuo;
	
	@Column
	private int peso;
	
	@Column
	private String dimensiones;
	
	@ManyToOne
	@JoinColumn(name="CodEspecie")
	private EspecieBean especie;
	
	@OneToMany(mappedBy="individuoMovimiento")
	private List<MovimientoBean> movimientos = new ArrayList<MovimientoBean>();
	
	public void addMovimientos(MovimientoBean movimiento) {
		
		if(!movimientos.contains(movimiento)) {
			
			movimientos.add(movimiento);
		}
	}
	
	public List<MovimientoBean> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientoBean> movimientos) {
		this.movimientos = movimientos;
	}

	public EspecieBean getEspecie() {
		return especie;
	}

	public void setEspecie(EspecieBean especie) {
		this.especie = especie;
	}

	public long getCodIndividuo() {
		return codIndividuo;
	}

	public void setCodIndividuo(long codIndividuo) {
		this.codIndividuo = codIndividuo;
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
