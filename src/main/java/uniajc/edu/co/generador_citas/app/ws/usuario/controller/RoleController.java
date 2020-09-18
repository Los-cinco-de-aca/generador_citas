package uniajc.edu.co.generador_citas.app.ws.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uniajc.edu.co.generador_citas.app.ws.pojos.Role;
import uniajc.edu.co.generador_citas.app.ws.usuario.service.RoleService;

@CrossOrigin(origins="http://localhost:3000")//Servidor REACT
@EnableAutoConfiguration
@RestController
@RequestMapping(value = "rolews")
public class RoleController {

	@Autowired
	RoleService service;
	
	@GetMapping(value= "list")
	public ResponseEntity<List<Role>> getEspecialidad(){
		List<Role> roles = service.findAll();
		return new ResponseEntity<List<Role>>(roles,HttpStatus.OK);
	}
}
