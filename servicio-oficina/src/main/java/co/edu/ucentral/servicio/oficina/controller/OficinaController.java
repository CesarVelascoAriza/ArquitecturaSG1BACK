package co.edu.ucentral.servicio.oficina.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.oficina.model.Oficina;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.oficina.service.OficinaService;
@RestController
public class OficinaController extends CommonsController<Oficina, OficinaService>{

	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@PathVariable(required = true) Long id,@Valid @RequestBody Oficina oficina, BindingResult result){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Optional<Oficina> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Oficina oficinaDB = optional.get();
		oficinaDB.setNombre(oficina.getNombre());
		oficinaDB.setDireccion(oficina.getDireccion());
		oficinaDB.setCiudad(oficina.getCiudad());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(oficinaDB));
	}
	
}
