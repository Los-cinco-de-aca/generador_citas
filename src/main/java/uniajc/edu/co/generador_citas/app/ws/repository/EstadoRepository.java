package uniajc.edu.co.generador_citas.app.ws.repository;

import org.springframework.stereotype.Repository;

import uniajc.edu.co.generador_citas.app.ws.pojos.Estado;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
