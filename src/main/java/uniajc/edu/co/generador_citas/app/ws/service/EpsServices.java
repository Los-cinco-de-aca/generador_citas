package uniajc.edu.co.generador_citas.app.ws.service;

import java.util.List;

import uniajc.edu.co.generador_citas.app.ws.pojos.Eps;

public interface EpsServices {
	
	List<Eps> findAll();
	
	Eps create(Eps eps);
	
	Eps update(Eps eps);
	
	void delete(Eps eps);

}
