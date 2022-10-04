package co.edu.ucentral.servicio.cargue.despacho.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.cargue.despacho.model.DespachoEnvios;
import co.edu.ucentral.servicio.cargue.despacho.repository.DespachoEnvioRepository;

@Service
public class DespachoEnvioServiceImp extends CommonsServiceImpl<DespachoEnvios, DespachoEnvioRepository> implements DesapchoEnvioService {

}
