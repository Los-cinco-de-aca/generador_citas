package uniajc.edu.co.generador_citas.app.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniajc.edu.co.generador_citas.app.ws.pojos.Role;
import uniajc.edu.co.generador_citas.app.ws.repository.RoleRepository;
import uniajc.edu.co.generador_citas.app.ws.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository repository;
	
	@Override
	public List<Role> findAll() {
		return repository.findAll();
	}

	@Override
	public Role create(Role role) {
		return null;
	}

	@Override
	public Role update(Role role) {
		return null;
	}

	@Override
	public void delete(Role role) {
      //Do nothing
	}

}
