package uniajc.edu.co.generador_citas.app.ws.citas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniajc.edu.co.generador_citas.app.ws.citas.service.CitasServices;
import uniajc.edu.co.generador_citas.app.ws.pojos.Cita;

@EnableAutoConfiguration
@RestController
@RequestMapping(value="api")
public class CitasController {
	
	
	@Autowired
	CitasServices citasServices;
	
	@GetMapping(value="consultar-citas")
	public ResponseEntity<List<Cita>> consultarCitas(){
		
		List<Cita> listCita = citasServices.consultarCitas();
		
		return new ResponseEntity<List<Cita>>(listCita, HttpStatus.OK);
	}
	
	

}
