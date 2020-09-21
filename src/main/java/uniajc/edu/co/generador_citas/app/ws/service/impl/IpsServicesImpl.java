package uniajc.edu.co.generador_citas.app.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uniajc.edu.co.generador_citas.app.ws.pojos.Ips;
import uniajc.edu.co.generador_citas.app.ws.repository.IpsRepository;
import uniajc.edu.co.generador_citas.app.ws.service.IpsServices;

@Service
public class IpsServicesImpl implements IpsServices {

	@Autowired
	IpsRepository ipsRepository;

	@Override
	public List<Ips> findAll() {
		return ipsRepository.findAll();
	}

	@Override
	public Ips create(Ips ips) {
		return ipsRepository.save(ips);
	}

	@Override
	public Ips update(Ips ips) {
		return ipsRepository.save(ips);
	}

	@Override
	public void delete(Ips ips) {
		ipsRepository.delete(ips);

	}

}
