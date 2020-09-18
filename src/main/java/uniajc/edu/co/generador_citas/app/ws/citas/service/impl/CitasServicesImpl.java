package uniajc.edu.co.generador_citas.app.ws.citas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import uniajc.edu.co.generador_citas.app.ws.citas.repository.CitaRepository;
import uniajc.edu.co.generador_citas.app.ws.citas.service.CitasServices;
import uniajc.edu.co.generador_citas.app.ws.pojos.Cita;

public class CitasServicesImpl implements CitasServices{
	
	@Autowired
	CitaRepository citaRepository;

	@Override
	public List<Cita> consultarCitas() {
		// TODO Auto-generated method stub
		return citaRepository.findAll();
	}

}
