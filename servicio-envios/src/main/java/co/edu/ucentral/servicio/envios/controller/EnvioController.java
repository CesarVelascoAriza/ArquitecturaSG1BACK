package co.edu.ucentral.servicio.envios.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.envio.modelo.Envio;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.envios.service.EnvioService;

@RestController
public class EnvioController extends CommonsController<Envio, EnvioService>{

	
	@PostMapping("/crear-envio-usuario")
	public ResponseEntity<?> guardarEnvio(@Valid @RequestBody Envio envio, BindingResult result){
		if(result.hasErrors())
			this.validar(result);
		service.crearUsuario(envio.getUsuarioEmisor());
		service.crearUsuario(envio.getUsuarioReceptor());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(envio));
		
	}
}
