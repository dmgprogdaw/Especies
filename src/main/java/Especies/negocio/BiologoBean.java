package Especies.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.JoinColumn;

@Entity
@Table(name="biologos")
public class BiologoBean {

	@Id
	@Column
	private long codBiologo;
	
	@Column
	private String nombre;
	
	@Column
	private String direccion;
	
	@Column
	private String provincia;
	
	@Column
	private String fechaTitulacion;


	public long getCodBiologo() {
		return codBiologo;
	}


	public void setCodBiologo(long codBiologo) {
		this.codBiologo = codBiologo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getFechaTitulacion() {
		return fechaTitulacion;
	}


	public void setFechaTitulacion(String fechaTitulacion) {
		this.fechaTitulacion = fechaTitulacion;
	}
	
	
	
}
