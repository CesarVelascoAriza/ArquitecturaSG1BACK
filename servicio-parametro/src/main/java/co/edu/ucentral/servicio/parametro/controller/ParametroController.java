package co.edu.ucentral.servicio.parametro.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.model.Categoria;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.parametro.service.ParametroService;

@RestController
public class ParametroController extends CommonsController<Categoria, ParametroService> {
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@PathVariable Long id, @Valid @RequestBody Categoria categoria ) {
		Optional<Categoria> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Categoria categoriaDb= optional.get();
		categoriaDb.setNombre(categoria.getNombre());
		categoriaDb.setVarible(categoria.getVarible());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(categoriaDb));
	}
	

}
