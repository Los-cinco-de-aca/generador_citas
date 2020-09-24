package uniajc.edu.co.generador_citas.app.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniajc.edu.co.generador_citas.app.ws.pojos.Estado;
import uniajc.edu.co.generador_citas.app.ws.repository.EstadoRepository;
import uniajc.edu.co.generador_citas.app.ws.service.EstadoServices;

@Service
public class EstadoServicesImpl implements EstadoServices{
	
	@Autowired
	EstadoRepository estadoRepository;

	@Override
	public List<Estado> findAll() {
		return estadoRepository.findAll();
	}

	@Override
	public Estado create(Estado estado) {
		return estadoRepository.save(estado);
	}

	@Override
	public Estado update(Estado estado) {
		return estadoRepository.save(estado);
	}

	@Override
	public void delete(Estado estado) {
		estadoRepository.delete(estado);
		
	}

}
