package co.edu.ucentral.servicio.categoria.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.model.Categoria;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.categoria.repository.ParametroRepository;

@Service
public class ParametroServiceImpl extends CommonsServiceImpl<Categoria, ParametroRepository> implements ParametroService {

}
