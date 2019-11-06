package Especies.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;

@Entity
@Table(name="especies")
public class EspecieBean {

	@Id
	@Column
	private long codigo;
	
	@Column
	private String nombre;
	
	@Column
	private String tipo;
	
	@Column
	private String periodosMigratorios;
	
	@Column
	private String caracteristicasPrincipales;
	
	@OneToMany(mappedBy="especie")
	private List<IndividuoBean> individuos = new ArrayList<IndividuoBean>();
	
	public void addIndividuo(IndividuoBean individuo) {
		
		if(!individuos.contains(individuo)) {
			
			individuos.add(individuo);
		}
	}

	public List<IndividuoBean> getIndividuos() {
		return individuos;
	}

	public void setIndividuos(List<IndividuoBean> individuos) {
		this.individuos = individuos;
	}

	public long getCodEspecie() {
		return codigo;
	}

	public void setCodEspecie(long codEspecie) {
		this.codigo = codEspecie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPeriodosMigratorios() {
		return periodosMigratorios;
	}

	public void setPeriodosMigratorios(String periodosMigratorios) {
		this.periodosMigratorios = periodosMigratorios;
	}

	public String getCaracteristicasPrincipales() {
		return caracteristicasPrincipales;
	}

	public void setCaracteristicasPrincipales(String caracteristicasPrincipales) {
		this.caracteristicasPrincipales = caracteristicasPrincipales;
	}
	
	
}
