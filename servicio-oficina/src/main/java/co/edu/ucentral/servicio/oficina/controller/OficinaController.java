package co.edu.ucentral.servicio.oficina.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.oficina.model.Oficina;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.oficina.service.OficinaService;
@RestController
public class OficinaController extends CommonsController<Oficina, OficinaService>{

}
