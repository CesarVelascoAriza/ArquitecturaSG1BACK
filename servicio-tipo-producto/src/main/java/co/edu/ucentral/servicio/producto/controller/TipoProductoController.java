package co.edu.ucentral.servicio.producto.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.model.TipoProducto;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.producto.service.TipoProductoService;

@RestController
public class TipoProductoController extends CommonsController<TipoProducto, TipoProductoService> {

}
