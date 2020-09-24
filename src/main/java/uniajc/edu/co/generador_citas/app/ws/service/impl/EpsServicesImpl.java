package uniajc.edu.co.generador_citas.app.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniajc.edu.co.generador_citas.app.ws.pojos.Eps;
import uniajc.edu.co.generador_citas.app.ws.repository.EpsRepository;
import uniajc.edu.co.generador_citas.app.ws.service.EpsServices;

@Service
public class EpsServicesImpl implements EpsServices {

	@Autowired
	EpsRepository epsRpository;

	@Override
	public List<Eps> findAll() {
		return epsRpository.findAll();
	}

	@Override
	public Eps create(Eps eps) {
		return epsRpository.save(eps);
	}

	@Override
	public Eps update(Eps eps) {
		return epsRpository.save(eps);
	}

	@Override
	public void delete(Eps eps) {
		epsRpository.delete(eps);
	}

}
