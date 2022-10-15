package co.edu.ucentral.servicio.envios.service;

import co.edu.ucentral.common.envio.modelo.Envio;
import co.edu.ucentral.commons.services.service.CommonsService;
import co.edu.ucentral.commons.usuario.models.Usuario;

public interface EnvioService extends CommonsService<Envio>{

	public Usuario crearUsuario(Usuario usuario);
}
