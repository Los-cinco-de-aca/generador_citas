package uniajc.edu.co.generador_citas.app.ws.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name="role")
@JsonInclude(value = Include.NON_NULL)
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer roleId;
	private String descripcion;
	
	
	public Especialidad fkEspecialidad;
	
	
	@ManyToOne
	@JoinColumn(name="fk_especialidad")
	public Especialidad getFkEspecialidad() {
		return fkEspecialidad;
	}

	public void setFkEspecialidad(Especialidad fkEspecialidad) {
		this.fkEspecialidad = fkEspecialidad;
	}

	public Role(){
		
	}
	
	public Role(Integer roleId, String descripcion) {
		this.roleId = roleId;
		this.descripcion = descripcion;
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "id_role")
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	


	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", descripcion=" + descripcion + "]";
	}
}
