package co.edu.ucentral.servicio.cargue.despacho.service;

import java.util.List;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.despacho.model.DespachoEnvios;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.cargue.despacho.repository.DespachoEnvioRepository;

@Service
public class DespachoEnvioServiceImp extends CommonsServiceImpl<DespachoEnvios, DespachoEnvioRepository> implements DesapchoEnvioService {

	@Override
	public List<DespachoEnvios> listarDespachosEnvioPorIdEnvio(long id) {
		// TODO Auto-generated method stub
		return repository.findDespachoEnviosEnvioByid(id);
	}

}
