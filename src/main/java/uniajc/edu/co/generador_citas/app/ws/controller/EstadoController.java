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

import uniajc.edu.co.generador_citas.app.ws.pojos.Estado;
import uniajc.edu.co.generador_citas.app.ws.service.EstadoServices;

@RestController
@RequestMapping(value="api")
public class EstadoController {
	
	
	@Autowired
	EstadoServices estadoServices;
	
	
	@GetMapping(value="estado")
	public ResponseEntity<List<Estado>> consultarEstado(){
		
		List<Estado> listEstado = estadoServices.findAll();
		
		return new ResponseEntity<>(listEstado, HttpStatus.OK);
	}
	
	@PostMapping(value="estado")
	public ResponseEntity<Estado> crearEstado(@RequestBody Estado estado){
		
		Estado crearEstado = estadoServices.create(estado);
		
		return new ResponseEntity<> (crearEstado, HttpStatus.OK);
	}

	@PutMapping(value="estado")
	public ResponseEntity<Estado> actualizarEstado(@RequestBody Estado estado){
		
		Estado actualizarEstado = estadoServices.update(estado);
		
		return new ResponseEntity<> (actualizarEstado, HttpStatus.OK);
	}	
	
	@DeleteMapping(value="estado")
	public ResponseEntity<String> deleteEstado(@RequestBody Estado estado){
		
		estadoServices.delete(estado);
		
		return new ResponseEntity<> ("Eliminado", HttpStatus.OK);
	}	

}
