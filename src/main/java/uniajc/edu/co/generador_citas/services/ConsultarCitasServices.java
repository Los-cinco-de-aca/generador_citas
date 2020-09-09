package uniajc.edu.co.generador_citas.services;

import org.springframework.stereotype.Service;

import uniajc.edu.co.generador_citas.response.ConsultarCitasResponse;


@Service
public class ConsultarCitasServices implements IConsultarCitasServices{

	@Override
	public ConsultarCitasResponse consultarCitas() {
		

		ConsultarCitasResponse response = new ConsultarCitasResponse();
		
		response.setMensaje("Citas");
		
		return response;
	}

}
