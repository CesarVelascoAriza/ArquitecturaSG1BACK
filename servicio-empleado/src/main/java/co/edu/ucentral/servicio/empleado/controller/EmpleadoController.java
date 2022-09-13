package co.edu.ucentral.servicio.empleado.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.empleado.model.Empleado;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.empleado.service.EmpleadoService;

@RestController
public class EmpleadoController extends CommonsController<Empleado, EmpleadoService>{

}
