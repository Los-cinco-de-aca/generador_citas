package uniajc.edu.co.generador_citas.app.ws.usuario.service;

import java.util.List;

import uniajc.edu.co.generador_citas.app.ws.pojos.Usuario;

public interface UserService {

	List<Usuario> findAll();
	
	Usuario createUser(Usuario usuario);
	
	Usuario updateUser(Usuario usuario);
	
	void deleteUser(Usuario usuario);
	
}
