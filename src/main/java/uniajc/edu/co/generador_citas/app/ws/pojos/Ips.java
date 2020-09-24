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
@Table(name = "ips")
@JsonInclude(value = Include.NON_NULL)
public class Ips implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idIps;
	private String centroMedico;

	
	public Ips(){}

	public Ips(Integer idIps, String centroMedico) {
		super();
		this.idIps = idIps;
		this.centroMedico = centroMedico;

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ips")
	public Integer getIdIps() {
		return idIps;
	}

	public void setIdIps(Integer idIps) {
		this.idIps = idIps;
	}

	@Column(name = "centro_medico")
	public String getCentroMedico() {
		return centroMedico;
	}

	public void setCentroMedico(String centroMedico) {
		this.centroMedico = centroMedico;
	}
	
	@Override
	public String toString() {
		return "Ips [idIps=" + idIps + ", centroMedico=" + centroMedico + "]";
	}

}
