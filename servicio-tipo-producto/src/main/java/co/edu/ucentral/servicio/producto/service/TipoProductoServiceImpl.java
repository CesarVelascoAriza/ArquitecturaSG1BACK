package co.edu.ucentral.servicio.producto.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.model.TipoProducto;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.producto.repository.TipoProductoRepository;
@Service
public class TipoProductoServiceImpl extends CommonsServiceImpl<TipoProducto, TipoProductoRepository> implements TipoProductoService {

}
