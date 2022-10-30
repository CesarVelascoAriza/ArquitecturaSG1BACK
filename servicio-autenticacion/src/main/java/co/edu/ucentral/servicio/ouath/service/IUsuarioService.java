package co.edu.ucentral.servicio.ouath.service;

import co.edu.ucentral.commons.usuario.models.Usuario;

public interface IUsuarioService  {

	public Usuario findByUsername(String username);
}
