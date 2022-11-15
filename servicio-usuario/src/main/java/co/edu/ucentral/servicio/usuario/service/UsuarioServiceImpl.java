package co.edu.ucentral.servicio.usuario.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.commons.usuario.models.Usuario;
import co.edu.ucentral.servicio.usuario.repository.UsuarioRepository;
@Service 
public class UsuarioServiceImpl  extends CommonsServiceImpl<Usuario, UsuarioRepository> implements UsuarioService{

	@Override
	public Usuario findByUsuario(String usuario){
		return repository.findByUsername(usuario);
	}

}
