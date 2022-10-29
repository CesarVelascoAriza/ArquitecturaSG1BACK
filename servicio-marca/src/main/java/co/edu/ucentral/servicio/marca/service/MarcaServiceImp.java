package co.edu.ucentral.servicio.marca.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.despacho.model.Marca;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.marca.repository.MarcaRepository;

@Service
public class MarcaServiceImp extends CommonsServiceImpl<Marca, MarcaRepository> implements MarcaService {

}
