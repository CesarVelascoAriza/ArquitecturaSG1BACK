package co.edu.ucentral.servicio.despacho.clienteFeing;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.ucentral.common.envio.modelo.Envio;

@FeignClient(name = "servicio-envio" , url = "localhost:8090/api/envio")
public interface ClienteFeingEnvio {
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Envio> getIdEnvio(@PathVariable Long id);
}
