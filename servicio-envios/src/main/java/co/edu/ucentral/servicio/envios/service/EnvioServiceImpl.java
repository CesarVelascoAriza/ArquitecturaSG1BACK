package co.edu.ucentral.servicio.envios.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.envio.modelo.Envio;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.envios.repository.EnvioRepository;

@Service
public class EnvioServiceImpl extends CommonsServiceImpl<Envio, EnvioRepository> implements EnvioService{

}
