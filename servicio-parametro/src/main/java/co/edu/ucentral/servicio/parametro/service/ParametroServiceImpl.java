package co.edu.ucentral.servicio.parametro.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.model.Categoria;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.parametro.repository.ParametroRepository;

@Service
public class ParametroServiceImpl extends CommonsServiceImpl<Categoria, ParametroRepository> implements ParametroService {

}
