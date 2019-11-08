package Especies.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.JoinColumn;

@Entity
@Table(name="informes")
public class InformeBean {

	@Id
	@Column
	private long codInforme;
	
	@Column
	private String fecha;


	public long getCodInforme() {
		return codInforme;
	}


	public void setCodInforme(long codInforme) {
		this.codInforme = codInforme;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
		
}
