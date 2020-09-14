package uniajc.edu.co.generador_citas.app.ws.pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name="especialidad")
@JsonInclude(value = Include.NON_NULL)
public class Especialidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer especialidadId;
	private String descripcion;
	
	
    private List<Role> listRoles;
	
	
	@OneToMany(targetEntity=Role.class, mappedBy="fkEspecialidad")
	@JsonIgnore
	public List<Role> getListRoles() {
		return listRoles;
	}

	public void setListRoles(List<Role> listRoles) {
		this.listRoles = listRoles;
	}

	public Especialidad(){
		
	}
	
	public Especialidad(Integer especialidadId, String descripcion) {
		this.especialidadId = especialidadId;
		this.descripcion = descripcion;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "id_especialidad")
	public Integer getEspecialidadId() {
		return especialidadId;
	}

	public void setEspecialidadId(Integer especialidadId) {
		this.especialidadId = especialidadId;
	}

	@Column(name= "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Especialidad [id_especialidad=" + especialidadId + ", descripcion=" + descripcion + "]";
	}
}
