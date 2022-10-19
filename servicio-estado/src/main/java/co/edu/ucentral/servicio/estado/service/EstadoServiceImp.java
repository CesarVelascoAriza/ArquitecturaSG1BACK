package co.edu.ucentral.servicio.estado.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.estado.model.Estado;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.estado.repository.EstadoRepository;
@Service
public class EstadoServiceImp extends CommonsServiceImpl<Estado, EstadoRepository> implements EstadoService {

}
