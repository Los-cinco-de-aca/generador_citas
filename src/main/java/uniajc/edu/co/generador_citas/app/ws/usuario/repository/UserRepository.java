package uniajc.edu.co.generador_citas.app.ws.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniajc.edu.co.generador_citas.app.ws.pojos.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Integer> {

}
