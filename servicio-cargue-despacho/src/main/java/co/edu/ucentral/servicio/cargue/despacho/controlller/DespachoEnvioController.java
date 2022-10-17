package co.edu.ucentral.servicio.cargue.despacho.controlller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.despacho.model.DespachoEnvios;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.cargue.despacho.service.DesapchoEnvioService;

@RestController
public class DespachoEnvioController extends CommonsController<DespachoEnvios, DesapchoEnvioService> {

}
