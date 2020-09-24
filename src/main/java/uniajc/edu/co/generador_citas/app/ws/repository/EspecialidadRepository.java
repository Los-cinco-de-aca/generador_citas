package uniajc.edu.co.generador_citas.app.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniajc.edu.co.generador_citas.app.ws.pojos.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer> {

}
