package co.edu.ucentral.servicio.envios.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.envio.modelo.Envio;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.envios.service.EnvioService;

@RestController
public class EnvioController extends CommonsController<Envio, EnvioService>{

}
