package co.edu.ucentral.servicio.despacho.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.despacho.model.Despacho;
import co.edu.ucentral.common.despacho.model.DespachoEnvios;
import co.edu.ucentral.common.envio.modelo.Envio;
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
		List<DespachoEnvios> eliminados= new  ArrayList<DespachoEnvios>();
		
		despachoDB.getDespachos().forEach(desEnv->{
			ResponseEntity<Envio> optinal =service.getIdEnvio(desEnv.getEnvio().getId());
			if(optinal.getStatusCode() == HttpStatus.NO_CONTENT)
				eliminados.add(desEnv);
			if(!despacho.getDespachos().contains(desEnv)) {
				eliminados.add(desEnv);
			}
			if(desEnv.getEntregado() && (despacho.getEstadoDespacho().getId()==6)) {
				desEnv.getEnvio().getEstado().setId(2L);
				service.actualizarEstado(desEnv.getEnvio().getId(), desEnv.getEnvio());
			}
			else if (desEnv.getEntregado() && (despacho.getEstadoDespacho().getId()==4)) {
				desEnv.getEnvio().getEstado().setId(11L);
				service.actualizarEstado(desEnv.getEnvio().getId(), desEnv.getEnvio());
			}
			else {
				desEnv.getEnvio().getEstado().setId(11L);
				service.actualizarEstado(desEnv.getEnvio().getId(), desEnv.getEnvio());
			}
		});
		eliminados.forEach(d->{
			despachoDB.removeDespachoEnvio(d);
		});
		despachoDB.setDespachos(despacho.getDespachos());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(despachoDB));
	}
	@Override
	@PostMapping
	public ResponseEntity<?> crear(@Valid @RequestBody Despacho despacho, BindingResult result) {
		if (result.hasErrors()) {
			return this.validar(result);
		}
		List<DespachoEnvios> eliminados= new  ArrayList<DespachoEnvios>();
		despacho.getDespachos().forEach(desEnv->{
			ResponseEntity<Envio> optinal =service.getIdEnvio(desEnv.getEnvio().getId());
			if(optinal.getStatusCode() == HttpStatus.NO_CONTENT) {
				eliminados.add(desEnv);;
			}
			
			if(despacho.getEstadoDespacho().getId()==3) {
				desEnv.getEnvio().getEstado().setId(3L);
				service.actualizarEstado(desEnv.getEnvio().getId(), desEnv.getEnvio());
			}else {
				desEnv.getEnvio().getEstado().setId(10L);
				
				service.actualizarEstado(desEnv.getEnvio().getId(), desEnv.getEnvio());
			}
		});
		eliminados.forEach(d->{
			despacho.removeDespachoEnvio(d);
		});
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(despacho));

	}
}
