package uniajc.edu.co.generador_citas.app.ws.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniajc.edu.co.generador_citas.app.ws.pojos.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
