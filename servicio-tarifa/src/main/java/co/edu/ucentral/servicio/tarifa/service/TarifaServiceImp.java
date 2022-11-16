package co.edu.ucentral.servicio.tarifa.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.model.Tarifa;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.tarifa.repository.TarifaRepository;

@Service
public class TarifaServiceImp extends CommonsServiceImpl<Tarifa, TarifaRepository> implements TarifaService {

	@Override
	public Tarifa calcularTarifa(int min, int max) {
		// TODO Auto-generated method stub
		return repository.findByValorMinLessThanEqualAndValorMaxGreaterThan(min, max);
	}

}
