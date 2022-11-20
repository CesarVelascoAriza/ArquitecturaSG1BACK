package co.edu.ucentral.servicio.cargue.despacho.controlller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.despacho.model.DespachoEnvios;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.cargue.despacho.service.DesapchoEnvioService;

@RestController
public class DespachoEnvioController extends CommonsController<DespachoEnvios, DesapchoEnvioService> {

	@GetMapping("/guia/{id}")
	public ResponseEntity<?> traerGuia(@PathVariable Long id){
		List<DespachoEnvios> despacho=service.listarDespachosEnvioPorIdEnvio(id);
		if(despacho.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(service.listarDespachosEnvioPorIdEnvio(id));
	}
}
