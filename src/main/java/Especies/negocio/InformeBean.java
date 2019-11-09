package Especies.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;

@Entity
@Table(name="informes")
public class InformeBean {

	@Id
	@Column
	private long codInforme;
	
	@Column
	private String fecha;
	
	
	@ManyToMany(mappedBy="movimientosInforme")
	private List<MovimientoBean> informeMovimientos = new ArrayList<MovimientoBean>();
	
	@ManyToMany
	private List<BiologoBean> biologosInforme = new ArrayList<BiologoBean>();
	

	public void addInformeMovimientos(MovimientoBean movimiento) {
		
		if(!informeMovimientos.contains(movimiento)) {
			
			informeMovimientos.add(movimiento);
			List<InformeBean> informes = movimiento.getMovimientosInforme();
			if(!informes.contains(this)) {
				
				informes.add(this);
			}
		}
	}

	
	
	public List<BiologoBean> getBiologosInforme() {
		return biologosInforme;
	}



	public void setBiologosInforme(List<BiologoBean> biologosInforme) {
		this.biologosInforme = biologosInforme;
	}


	public List<MovimientoBean> getInformeMovimientos() {
		return informeMovimientos;
	}


	public void setInformeMovimientos(List<MovimientoBean> informeMovimientos) {
		this.informeMovimientos = informeMovimientos;
	}


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
