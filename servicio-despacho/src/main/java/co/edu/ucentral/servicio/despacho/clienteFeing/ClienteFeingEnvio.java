package co.edu.ucentral.servicio.despacho.clienteFeing;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.edu.ucentral.common.envio.modelo.Envio;

@FeignClient(name = "servicio-envio")
public interface ClienteFeingEnvio {
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Envio> getIdEnvio(@PathVariable Long id);
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarEstado(@PathVariable Long id, @Valid @RequestBody Envio envio);
	
}
