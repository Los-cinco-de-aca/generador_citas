package uniajc.edu.co.generador_citas.app.ws.service;

import java.util.List;

import uniajc.edu.co.generador_citas.app.ws.pojos.Especialidad;

public interface EspecialidadService {

	List<Especialidad> listEspecialidad();
	
	Especialidad create(Especialidad especialidad);
	
	Especialidad update(Especialidad especialidad);
	
	void delete(Especialidad especialidad);
}
