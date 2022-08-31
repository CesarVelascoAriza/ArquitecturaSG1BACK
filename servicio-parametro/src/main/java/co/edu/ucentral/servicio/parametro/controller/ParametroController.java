package co.edu.ucentral.servicio.parametro.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.model.Parametro;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.parametro.service.ParametroService;

@RestController
public class ParametroController extends CommonsController<Parametro, ParametroService> {
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@PathVariable Long id, @Valid @RequestBody Parametro parametro ) {
		Optional<Parametro> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Parametro parametroDb= optional.get();
		parametroDb.setDescParam(parametro.getDescParam());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(parametroDb));
	}
	

}
