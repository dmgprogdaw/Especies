package Especies.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name="movimientos")
public class MovimientoBean {

	@Id
	@Column
	private long codMovimiento;
	
	@Column
	private String fecha;
	
	@Column
	private String tipo;
	
	@Column
	private String hora;
	
	@ManyToOne
	@JoinColumn(name="codIndividuo")
	private IndividuoBean individuoMovimiento;
	
	@ManyToOne
	@JoinColumn(name="codTorreta")
	private TorretaBean torreta;
	
	@ManyToMany
	private List<InformeBean> movimientosInforme = new ArrayList<InformeBean>();

	public void addMovimientosInforme(InformeBean informe) {
		
		if(!movimientosInforme.contains(informe)) {
			
			movimientosInforme.add(informe);
			informe.addInformeMovimientos(this);
		}
	}
	
	
	public List<InformeBean> getMovimientosInforme() {
		return movimientosInforme;
	}

	public void setMovimientosInforme(List<InformeBean> movimientosInforme) {
		this.movimientosInforme = movimientosInforme;
	}

	public TorretaBean getTorreta() {
		return torreta;
	}

	public void setTorreta(TorretaBean torreta) {
		this.torreta = torreta;
	}

	public IndividuoBean getIndividuoMovimiento() {
		return individuoMovimiento;
	}

	public void setIndividuoMovimiento(IndividuoBean individuoMovimiento) {
		this.individuoMovimiento = individuoMovimiento;
	}

	public long getCodMovimiento() {
		return codMovimiento;
	}

	public void setCodMovimiento(long codMovimiento) {
		this.codMovimiento = codMovimiento;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
}
