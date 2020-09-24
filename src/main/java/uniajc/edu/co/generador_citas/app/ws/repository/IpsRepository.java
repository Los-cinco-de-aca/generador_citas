package uniajc.edu.co.generador_citas.app.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uniajc.edu.co.generador_citas.app.ws.pojos.Ips;

@Repository
public interface IpsRepository extends JpaRepository<Ips, Integer>{

}
