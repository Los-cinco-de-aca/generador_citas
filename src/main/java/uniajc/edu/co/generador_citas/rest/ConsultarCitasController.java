package uniajc.edu.co.generador_citas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniajc.edu.co.generador_citas.services.IConsultarCitasServices;

@RestController
@RequestMapping("/api")
public class ConsultarCitasController {
	
	@Autowired
	IConsultarCitasServices consultarCitasServices;
	

}


