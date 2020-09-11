package uniajc.edu.co.generador_citas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import uniajc.edu.co.generador_citas.response.ConsultarCitasResponse;
import uniajc.edu.co.generador_citas.response.GeneralResponse;
import uniajc.edu.co.generador_citas.services.IConsultarCitasServices;

@RestController
@RequestMapping("/api")
public class ConsultarCitasController {
	
	@Autowired
	IConsultarCitasServices consultarCitasServices;
	
	
	@RequestMapping(value = "/consultaCitas", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> consultarCitas() {

		Gson gson = new Gson();

		ConsultarCitasResponse response = consultarCitasServices.consultarCitas();

		GeneralResponse resp = new GeneralResponse();
		resp.setMensaje(gson.toJson(response));

		return new ResponseEntity<GeneralResponse>(resp, HttpStatus.OK);
	}
	
	
	

}


