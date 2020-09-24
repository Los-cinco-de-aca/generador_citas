package uniajc.edu.co.generador_citas.app.ws.service.impl;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniajc.edu.co.generador_citas.app.ws.pojos.Usuario;
import uniajc.edu.co.generador_citas.app.ws.repository.UserRepository;
import uniajc.edu.co.generador_citas.app.ws.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	Logger log= Logger.getLogger(UserServiceImpl.class.getName());
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<Usuario> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Usuario createUser(Usuario usuario) {
		 return userRepository.save(usuario);
	}

	@Override
	public Usuario updateUser(Usuario usuario) {
		return userRepository.save(usuario);
	}

	@Override
	public void deleteUser(Usuario usuario) {
		userRepository.delete(usuario);
	}

}
