package uniajc.edu.co.generador_citas.app.ws.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
