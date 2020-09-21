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

import uniajc.edu.co.generador_citas.app.ws.pojos.Eps;
import uniajc.edu.co.generador_citas.app.ws.service.EpsServices;



@RestController
@RequestMapping(value="api")
public class EpsController {
	
	@Autowired
	EpsServices epsServices;
	
	@GetMapping(value="eps")
	public ResponseEntity<List<Eps>> consultarEps(){
		
		List<Eps> listEps = epsServices.findAll();
		
		return new ResponseEntity<List<Eps>>(listEps, HttpStatus.OK);
	}
	
	@PostMapping(value="eps")
	public ResponseEntity<Eps> crearEps(@RequestBody Eps eps){
		
		Eps crearEps = epsServices.create(eps);
		
		return new ResponseEntity<Eps> (crearEps, HttpStatus.OK);
	}

	@PutMapping(value="eps")
	public ResponseEntity<Eps> actualizarEps(@RequestBody Eps eps){
		
		Eps actualizarEps = epsServices.update(eps);
		
		return new ResponseEntity<Eps> (actualizarEps, HttpStatus.OK);
	}	
	
	@DeleteMapping(value="eps")
	public ResponseEntity<String> deleteEps(@RequestBody Eps eps){
		
		epsServices.delete(eps);
		
		return new ResponseEntity<String> ("Eliminado", HttpStatus.OK);
	}	

}
