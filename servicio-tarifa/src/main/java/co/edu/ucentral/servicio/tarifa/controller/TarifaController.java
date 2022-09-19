package co.edu.ucentral.servicio.tarifa.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.model.Tarifa;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.tarifa.service.TarifaService;

@RestController
public class TarifaController extends CommonsController<Tarifa, TarifaService> {

}
