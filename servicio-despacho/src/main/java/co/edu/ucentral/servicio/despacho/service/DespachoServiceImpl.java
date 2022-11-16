package co.edu.ucentral.servicio.despacho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ucentral.common.despacho.model.Despacho;
import co.edu.ucentral.common.envio.modelo.Envio;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.despacho.clienteFeing.ClienteFeingEnvio;
import co.edu.ucentral.servicio.despacho.repository.DespachoRepository;

@Service
public class DespachoServiceImpl extends CommonsServiceImpl<Despacho, DespachoRepository> implements DespachoService{

	
	@Autowired
	private ClienteFeingEnvio clienteEnvio;
	@Transactional(readOnly = true)
	@Override
	public ResponseEntity<Envio> getIdEnvio(Long id) {
		return clienteEnvio.getIdEnvio(id);
	}
	@Override
	public ResponseEntity<?> actualizarEstado(Long id, Envio envio) {
		// TODO Auto-generated method stub
		return clienteEnvio.actualizarEstado(id, envio);
	}

}
