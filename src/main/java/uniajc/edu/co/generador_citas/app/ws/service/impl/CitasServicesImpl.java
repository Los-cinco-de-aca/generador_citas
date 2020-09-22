package uniajc.edu.co.generador_citas.app.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniajc.edu.co.generador_citas.app.ws.pojos.Cita;
import uniajc.edu.co.generador_citas.app.ws.repository.CitaRepository;
import uniajc.edu.co.generador_citas.app.ws.service.CitasServices;

@Service
public class CitasServicesImpl implements CitasServices{
	
	@Autowired
	CitaRepository citaRepository;

	@Override
	public List<Cita> findAll() {

		return citaRepository.findAll();
	}

	@Override
	public Cita create(Cita cita) {

		return citaRepository.save(cita);
	}

	@Override
	public Cita update(Cita cita) {
		return citaRepository.save(cita);
	}

	@Override
	public void delete(Cita cita) {

		citaRepository.delete(cita);
	}

}
