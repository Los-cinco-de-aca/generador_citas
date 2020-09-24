package uniajc.edu.co.generador_citas.app.ws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniajc.edu.co.generador_citas.app.ws.pojos.Cita;
import uniajc.edu.co.generador_citas.app.ws.service.CitasServices;


@RestController
@RequestMapping(value="api")
public class CitasController {
	
	
	@Autowired
	CitasServices citasServices;
	
	@GetMapping(value="citas")
	public ResponseEntity<List<Cita>> consultarCitas(){
		
		List<Cita> listCita = citasServices.findAll();
		
		return new ResponseEntity<>(listCita, HttpStatus.OK);
	}
	
	@PostMapping(value="citas")
	public ResponseEntity<Cita> crearCitas(@RequestBody Cita cita){
		
		Cita crearCita = citasServices.create(cita);
		
		return new ResponseEntity<> (crearCita, HttpStatus.OK);
	}

	@PutMapping(value="citas")
	public ResponseEntity<Cita> actualizarCitas(@RequestBody Cita cita){
		
		Cita actualizarCita = citasServices.update(cita);
		
		return new ResponseEntity<> (actualizarCita, HttpStatus.OK);
	}	
	
	@DeleteMapping(value="citas")
	public ResponseEntity<String> deleteCitas(@RequestBody Cita cita){
		
        citasServices.delete(cita);
		
		return new ResponseEntity<> ("Eliminado", HttpStatus.OK);
	}	
}
