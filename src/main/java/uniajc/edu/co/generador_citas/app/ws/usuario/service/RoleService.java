package uniajc.edu.co.generador_citas.app.ws.usuario.service;

import java.util.List;

import uniajc.edu.co.generador_citas.app.ws.pojos.Role;

public interface RoleService {

	List<Role> findAll();
	
	Role create(Role role);
	
	Role update(Role role);
	
	void delete(Role role);
	
}
