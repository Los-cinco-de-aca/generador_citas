package uniajc.edu.co.generador_citas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniajc.edu.co.generador_citas.dao.IGeneradorCitasDAO;
import uniajc.edu.co.generador_citas.response.ConsultarCitasResponse;


@Service
public class ConsultarCitasServices implements IConsultarCitasServices{
	
	@Autowired
	 private IGeneradorCitasDAO citasDAO;

	@Override
	public ConsultarCitasResponse consultarCitas() {
		
		return citasDAO.consultarCitas();
	}

	public IGeneradorCitasDAO getCitasDAO() {
		return citasDAO;
	}

	public void setCitasDAO(IGeneradorCitasDAO citasDAO) {
		this.citasDAO = citasDAO;
	}
	
}
