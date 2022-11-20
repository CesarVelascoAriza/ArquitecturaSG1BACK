package co.edu.ucentral.servicio.envios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.common.envio.modelo.Envio;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.commons.usuario.models.Usuario;
import co.edu.ucentral.servicio.envios.FeingClienteUsuario.FeingCliente;
import co.edu.ucentral.servicio.envios.repository.EnvioRepository;

@Service
public class EnvioServiceImpl extends CommonsServiceImpl<Envio, EnvioRepository> implements EnvioService{

	@Autowired
	private FeingCliente feingCliente;
	
	@Override
	public Usuario crearUsuario(Usuario usuario) {
		return feingCliente.crear(usuario);
	}

	@Override
	public List<Envio> listadoEnvioPorAdmicion(Long[] id) {
		// TODO Auto-generated method stub
		return repository.findEnvioEstadoByIdIn(id);
	}

	
	

}
