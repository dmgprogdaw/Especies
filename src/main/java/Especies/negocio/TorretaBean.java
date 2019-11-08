package Especies.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="torretas")
public class TorretaBean {

	@Id
	@Column
	private long codTorreta;
	
	@Column
	private String nombre; 
	
	@Column
	private String ubicacion;

	@OneToMany(mappedBy="torreta")
	private List<MovimientoBean> movimientosTorreta = new ArrayList<MovimientoBean>();
	
	public void addMovimientoTorreta(MovimientoBean movimiento) {
		
		if(!movimientosTorreta.contains(movimiento)) {
			
			movimientosTorreta.add(movimiento);
		}
	}
	
	public List<MovimientoBean> getMovimientosTorreta() {
		return movimientosTorreta;
	}


	public void setMovimientosTorreta(List<MovimientoBean> movimientosTorreta) {
		this.movimientosTorreta = movimientosTorreta;
	}


	public long getCodTorreta() {
		return codTorreta;
	}


	public void setCodTorreta(long codTorreta) {
		this.codTorreta = codTorreta;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
	
}
