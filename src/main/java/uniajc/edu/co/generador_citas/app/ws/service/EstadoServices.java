package uniajc.edu.co.generador_citas.app.ws.service;

import java.util.List;

import uniajc.edu.co.generador_citas.app.ws.pojos.Estado;

public interface EstadoServices {
	
	List<Estado> findAll();
	
	Estado create(Estado estado);
	
	Estado update(Estado estado);
	
	void delete(Estado estado);

}
