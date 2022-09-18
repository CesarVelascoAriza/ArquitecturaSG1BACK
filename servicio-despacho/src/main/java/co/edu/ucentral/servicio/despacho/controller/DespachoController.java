package co.edu.ucentral.servicio.despacho.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.despacho.model.Despacho;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.despacho.service.DespachoService;

@RestController
public class DespachoController extends CommonsController<Despacho, DespachoService> {

}
