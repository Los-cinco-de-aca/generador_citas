package uniajc.edu.co.generador_citas.app.ws.usuario.service;

import java.util.List;

import uniajc.edu.co.generador_citas.app.ws.pojos.Especialidad;

public interface EspecialidadService {

	List<Especialidad> findAll();
	
	Especialidad create(Especialidad especialidad);
	
	Especialidad update(Especialidad especialidad);
	
	void delete(Especialidad especialidad);
}
