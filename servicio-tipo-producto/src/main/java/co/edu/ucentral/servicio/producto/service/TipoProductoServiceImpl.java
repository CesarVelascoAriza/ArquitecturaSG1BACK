package co.edu.ucentral.servicio.producto.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.model.Variable;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.producto.repository.TipoProductoRepository;
@Service
public class TipoProductoServiceImpl extends CommonsServiceImpl<Variable, TipoProductoRepository> implements TipoProductoService {

}
