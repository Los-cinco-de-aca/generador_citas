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
@Table(name = "estado")
@JsonInclude(value = Include.NON_NULL)
public class Estado implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idEstado;
	private String nombreEstado;

	public Estado(){}
	
	public Estado(Integer idEstado, String estado) {
		super();
		this.idEstado = idEstado;
		this.nombreEstado = estado;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estado")
	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	
	
	@Column(name = "estado")
	public String getNombreEstado() {
		return nombreEstado;
	}

	public void setNombreEstado(String nombreEstado) {
		this.nombreEstado = nombreEstado;
	}
	
	@Override
	public String toString() {
		return "Estado [idEstado=" + idEstado + ", estado=" + nombreEstado + "]";
	}

}
