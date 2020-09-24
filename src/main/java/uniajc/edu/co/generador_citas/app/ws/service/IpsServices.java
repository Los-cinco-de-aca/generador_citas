package uniajc.edu.co.generador_citas.app.ws.service;

import java.util.List;

import uniajc.edu.co.generador_citas.app.ws.pojos.Ips;

public interface IpsServices {
	
	List<Ips> findAll();
	
	Ips create(Ips ips);
	
	Ips update(Ips ips);
	
	void delete(Ips ips);

}
