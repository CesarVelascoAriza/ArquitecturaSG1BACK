package co.edu.ucentral.servicio.ciudad.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.oficina.model.Ciudad;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.ciudad.repository.CiudadRepository;

@Service
public class CiudadServiceImp extends CommonsServiceImpl<Ciudad, CiudadRepository> implements CiudadService {

}
