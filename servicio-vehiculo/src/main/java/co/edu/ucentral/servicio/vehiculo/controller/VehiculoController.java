package co.edu.ucentral.servicio.vehiculo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.despacho.model.Vehiculo;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.vehiculo.service.VehiculoService;

@RestController
public class VehiculoController extends CommonsController<Vehiculo, VehiculoService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@Valid @RequestBody Vehiculo vehiculo, @PathVariable Long id,BindingResult result){
		if (result.hasErrors()) {
			this.validar(result);
		}
		Optional<Vehiculo> optional = service.findById(id);
		if(!optional.isPresent())
			return ResponseEntity.notFound().build();
		Vehiculo vehiculoDB= optional.get();
		vehiculoDB.setMarca(vehiculo.getMarca());
		vehiculoDB.setMedio(vehiculo.getMedio());
		vehiculoDB.setPlaca(vehiculo.getPlaca());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(vehiculoDB));
	}
	
}
