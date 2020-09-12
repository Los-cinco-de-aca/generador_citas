package uniajc.edu.co.generador_citas.app.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniajc.edu.co.generador_citas.app.ws.pojos.Especialidad;
import uniajc.edu.co.generador_citas.app.ws.repository.EspecialidadRepository;
import uniajc.edu.co.generador_citas.app.ws.service.EspecialidadService;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

	@Autowired
	EspecialidadRepository repository;
	
	@Override
	public List<Especialidad> listEspecialidad() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Especialidad create(Especialidad especialidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Especialidad update(Especialidad especialidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Especialidad especialidad) {
		// TODO Auto-generated method stub
		
	}

}
