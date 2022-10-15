package co.edu.ucentral.servicio.tarifa.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.model.Tarifa;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.tarifa.service.TarifaService;

@RestController
public class TarifaController extends CommonsController<Tarifa, TarifaService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@PathVariable Long id, @Valid @RequestBody Tarifa tarifa, BindingResult result ){
		if(result.hasErrors()) {
			this.validar(result);
		}
		Optional<Tarifa> optional = service.findById(id);
		
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Tarifa tarifaDB= optional.get();
		tarifaDB.setValorMin(tarifa.getValorMin());
		tarifaDB.setValorMax(tarifa.getValorMax());
		tarifaDB.setPrecio(tarifa.getPrecio());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(tarifaDB));
	}
}
