package co.edu.ucentral.servicio.producto.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.model.Variable;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.producto.service.TipoProductoService;

@RestController
public class TipoProductoController extends CommonsController<Variable, TipoProductoService> {
	
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@PathVariable Long id ,@Valid @RequestBody Variable producto){
		Optional<Variable> optional = this.service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Variable productoDb= optional.get();
		productoDb.setNombre(producto.getNombre());
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(productoDb));
	}
	
	

}
