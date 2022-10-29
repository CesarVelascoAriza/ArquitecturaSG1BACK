package co.edu.ucentral.servicio.marca.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.despacho.model.Marca;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.marca.service.MarcaService;

@RestController
public class MarcaController extends CommonsController<Marca, MarcaService> {

}
