package co.edu.ucentral.servicio.oficina.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.oficina.model.Oficina;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.oficina.repository.OficinaRepository;
@Service
public class OficinaServiceImp extends CommonsServiceImpl<Oficina, OficinaRepository> implements OficinaService {

}
