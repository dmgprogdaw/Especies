package Especies.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import java.util.List;
import java.util.ArrayList;

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
	
	
	@ManyToMany(mappedBy="biologosInforme")
	private List<InformeBean> informesBiologo = new ArrayList<InformeBean>();

	
	public void addInformes(InformeBean informe) {
		
		if(!informesBiologo.contains(informe)) {
			
			informesBiologo.add(informe);
			informe.addBiologos(this);
		}
	}
	

	public List<InformeBean> getInformesBiologo() {
		return informesBiologo;
	}


	public void setInformesBiologo(List<InformeBean> informesBiologo) {
		this.informesBiologo = informesBiologo;
	}


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
