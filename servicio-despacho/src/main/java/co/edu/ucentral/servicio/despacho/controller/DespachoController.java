package co.edu.ucentral.servicio.despacho.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.despacho.model.Despacho;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.despacho.service.DespachoService;

@RestController
public class DespachoController extends CommonsController<Despacho, DespachoService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarDespacho(@PathVariable Long id,  @Valid @RequestBody Despacho despacho){
		Optional<Despacho> optional= service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Despacho despachoDB = optional.get();
		despachoDB.setOrigen(despacho.getOrigen());
		despachoDB.setDestino(despacho.getDestino());
		despachoDB.setVehiculo(despacho.getVehiculo());
		despachoDB.setEstadoDespacho(despacho.getEstadoDespacho());
		despachoDB.setObservaciones(despacho.getObservaciones());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(despachoDB));
	}
}
