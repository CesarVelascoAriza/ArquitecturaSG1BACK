package co.edu.ucentral.servicio.despacho.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import co.edu.ucentral.common.despacho.model.Despacho;
import co.edu.ucentral.common.envio.modelo.Envio;
import co.edu.ucentral.commons.services.service.CommonsService;

public interface DespachoService extends CommonsService<Despacho>{

	public ResponseEntity<Envio> getIdEnvio(Long id);
}
