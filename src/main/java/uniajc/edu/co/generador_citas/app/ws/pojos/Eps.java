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
@Table(name = "eps")
@JsonInclude(value = Include.NON_NULL)
public class Eps implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idEps;
	private String nombreEps;

	public Eps(Integer idEps, String nombreEps) {
		super();
		this.idEps = idEps;
		this.nombreEps = nombreEps;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_eps")
	public Integer getIdEps() {
		return idEps;
	}

	public void setIdEps(Integer idEps) {
		this.idEps = idEps;
	}

	@Column(name = "nombre_eps")
	public String getNombreEps() {
		return nombreEps;
	}

	public void setNombreEps(String nombreEps) {
		this.nombreEps = nombreEps;
	}

	@Override
	public String toString() {
		return "Eps [idEps=" + idEps + ", nombreEps=" + nombreEps + "]";
	}

}
