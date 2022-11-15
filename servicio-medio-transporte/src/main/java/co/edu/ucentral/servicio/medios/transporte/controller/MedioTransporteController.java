package co.edu.ucentral.servicio.medios.transporte.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.despacho.model.MedioTransporte;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.medios.transporte.service.MedioTransporteService;

@RestController
public class MedioTransporteController extends CommonsController<MedioTransporte, MedioTransporteService> {

}
