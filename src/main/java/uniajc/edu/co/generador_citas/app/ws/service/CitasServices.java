package uniajc.edu.co.generador_citas.app.ws.service;

import java.util.List;

import uniajc.edu.co.generador_citas.app.ws.pojos.Cita;

public interface CitasServices {
	
	
	List<Cita> findAll();
	
	Cita create(Cita cita);
	
	Cita update(Cita cita);
	
	void delete(Cita cita);
	

}
