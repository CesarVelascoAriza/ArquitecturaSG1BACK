package co.edu.ucentral.servicio.estado.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.estado.model.Estado;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.estado.service.EstadoService;
@RestController
public class EstadoController extends CommonsController<Estado, EstadoService> {
	
	@PutMapping("{id}")
	public ResponseEntity<?> actualizar(@Valid @RequestBody Estado estado, @PathVariable Long id, BindingResult result){
		if(result.hasErrors())
			this.validar(result);
		Optional<Estado> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Estado estadoDB= optional.get();
		estadoDB.setEstado(estado.getEstado());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(estadoDB));
	}

}
