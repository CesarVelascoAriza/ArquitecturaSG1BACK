package co.edu.ucentral.servicio.ciudad.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.oficina.model.Ciudad;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.ciudad.service.CiudadService;

@RestController
public class CiudadController extends CommonsController<Ciudad, CiudadService> {

}
