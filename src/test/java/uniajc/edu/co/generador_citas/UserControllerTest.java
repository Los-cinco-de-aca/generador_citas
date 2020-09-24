package uniajc.edu.co.generador_citas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import uniajc.edu.co.generador_citas.app.ws.pojos.Usuario;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
 class UserControllerTest {
	
	@LocalServerPort
	int randomServerPort;
	
	String url = "http://localhost:";
	
	@Test
	public void testGetUusuario () throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = url + randomServerPort + "/usuariows/list";
		URI uri = new URI(baseUrl);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization","Bearer " +"7f2658b5-51f2-4b34-b4b8-a256d35d570f");
		HttpEntity<String> request = new HttpEntity<>(headers);
		ResponseEntity<String> result = restTemplate.exchange(uri,HttpMethod.GET,request,String.class);
	    assertEquals(200, result.getStatusCodeValue());
	}
	
	@Test
	public void testPostUsuario() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = url + randomServerPort + "/usuariows/create";
		URI uri = new URI(baseUrl);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization","Bearer " +"7f2658b5-51f2-4b34-b4b8-a256d35d570f");
		
		int documento = (int) (Math.random()*25+1);
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(1113);
		usuario.setContrasena("Palomino");
		usuario.setApellido("Palomino");
		usuario.setDireccion("Carrera 20");
		usuario.setDocumento(String.valueOf(documento));
		usuario.setEmail("Jonathan@palomino");
		usuario.setNombre("Jonathan");
		usuario.setTelefono("234566");
		usuario.setFechaNacimiento(new Date());
		usuario.setGenero("Hombre");
		HttpEntity<Usuario> request = new HttpEntity<>(usuario,headers);
		ResponseEntity<String> result = restTemplate.exchange(uri,HttpMethod.POST,request,String.class);
	    assertEquals(200, result.getStatusCodeValue());
	}
	
	@Test
	public void testDeleteUsuario() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		final String baseUrl = url + randomServerPort + "/usuariows/delete";
		URI uri = new URI(baseUrl);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("Authorization","Bearer " +"7f2658b5-51f2-4b34-b4b8-a256d35d570f");
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(1113);
		usuario.setContrasena("Palomino");
		usuario.setApellido("Palomino");
		usuario.setDireccion("Carrera 20");
		usuario.setDocumento("1113658765");
		usuario.setEmail("Jonathan@palomino");
		usuario.setNombre("Jonathan");
		usuario.setTelefono("234566");
		usuario.setFechaNacimiento(new Date());
		usuario.setGenero("Hombre");
		HttpEntity<Usuario> request = new HttpEntity<>(usuario,headers);
		ResponseEntity<String> result = restTemplate.exchange(uri,HttpMethod.DELETE,request,String.class);
	    assertEquals(200, result.getStatusCodeValue());
	}


}
