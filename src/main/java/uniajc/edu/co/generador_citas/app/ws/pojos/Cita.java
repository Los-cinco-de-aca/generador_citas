package uniajc.edu.co.generador_citas.app.ws.pojos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Entity
@Table(name = "Cita")
@JsonInclude(value = Include.NON_NULL)
public class Cita implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer idCita;
	private String fkPaciente;
	private String fkMedico;
	private String fkIps;
	private Date fechaInicio;
	private Date fechaFinal;
	private String fkEstado;
	private String referenciaHistoriaCita;
	
	
	public Cita(Cita cita) {
		this.idCita = cita.idCita;
		this.fkPaciente = cita.fkPaciente;
		this.fkMedico = cita.fkMedico;
		this.fkIps = cita.fkIps;
		this.fechaInicio = cita.fechaInicio;
		this.fechaFinal = cita.fechaFinal;
		this.fkEstado = cita.fkEstado;
		this.referenciaHistoriaCita = cita.referenciaHistoriaCita;
		
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_cita")
	public Integer getIdCita() {
		return idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}

	
	
	@Column(name="fk_paciente")
	public String getPaciente() {
		return fkPaciente;
	}

    
	public void setPaciente(String fkPaciente) {
		this.fkPaciente = fkPaciente;
	}

	
	@Column(name="fk_medico")
	public String getMedico() {
		return fkMedico;
	}


	public void setMedico(String fkMedico) {
		this.fkMedico = fkMedico;
	}

	
	@Column(name="fk_ips")
	public String getIps() {
		return fkIps;
	}


	public void setIps(String fkIps) {
		this.fkIps = fkIps;
	}

	@Column(name="fecha_inicio")
	public Date getFechaInicio() {
		return fechaInicio;
	}

    
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Column(name="fecha_fin")
	public Date getFechaFinal() {
		return fechaFinal;
	}


	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	
	@Column(name="fk_estado")
	public String getEstado() {
		return fkEstado;
	}


	public void setEstado(String fkEstado) {
		this.fkEstado = fkEstado;
	}

	
	@Column(name="auto_refer_hitoria_cita")
	public String getReferenciaHistoriaCita() {
		return referenciaHistoriaCita;
	}

	public void setReferenciaHistoriaCita(String referenciaHistoriaCita) {
		this.referenciaHistoriaCita = referenciaHistoriaCita;
	}

	@Override
	public String toString() {
		return "Cita [idCita=" + idCita + ", fkPaciente=" + fkPaciente + ", fkMedico=" + fkMedico + ", fkIps=" + fkIps
				+ ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", fkEstado=" + fkEstado
				+ ", ReferenciahistoriaCita=" + referenciaHistoriaCita + "]";
	}


	
    
	
	
	

}
