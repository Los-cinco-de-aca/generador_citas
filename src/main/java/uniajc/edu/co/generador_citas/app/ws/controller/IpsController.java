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

import uniajc.edu.co.generador_citas.app.ws.pojos.Ips;
import uniajc.edu.co.generador_citas.app.ws.service.IpsServices;

@RestController
@RequestMapping(value="apis1")
public class IpsController {
	
	@Autowired
	IpsServices ipsServices;
	
	@GetMapping(value="ips")
	public ResponseEntity<List<Ips>> consultarIps(){
		
		List<Ips> listIps = ipsServices.findAll();
		
		return new ResponseEntity<List<Ips>>(listIps, HttpStatus.OK);
	}
	
	@PostMapping(value="ips")
	public ResponseEntity<Ips> crearIps(@RequestBody Ips ips){
		
		Ips crearIps = ipsServices.create(ips);
		
		return new ResponseEntity<Ips> (crearIps, HttpStatus.OK);
	}

	@PutMapping(value="ips")
	public ResponseEntity<Ips> actualizarIps(@RequestBody Ips ips){
		
		Ips actualizarIps = ipsServices.update(ips);
		
		return new ResponseEntity<Ips> (actualizarIps, HttpStatus.OK);
	}	
	
	@DeleteMapping(value="ips")
	public ResponseEntity<String> deleteIps(@RequestBody Ips ips){
		
		ipsServices.delete(ips);
		
		return new ResponseEntity<String> ("Eliminado", HttpStatus.OK);
	}	

}
