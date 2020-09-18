package uniajc.edu.co.generador_citas.app.ws.pojos;

import java.io.Serializable;

import javax.persistence.Column;

public class Cita implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	private Integer idCita;
	
	
	
	
	public Cita() {
		//Do nothing
	}
	
	
	
    @Column(name="id_cita")
	public Integer getIdCita() {
		return idCita;
	}

	public void setIdCita(Integer idCita) {
		this.idCita = idCita;
	}
	
	
	

}
