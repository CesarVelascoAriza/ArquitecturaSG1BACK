package co.edu.ucentral.servicio.atenticacion.service;

import java.util.Optional;

import co.edu.ucentral.common.empleado.model.Empleado;
import co.edu.ucentral.commons.usuario.models.Usuario;

public interface AutenticacionService {
	
	public Optional<Usuario> findByUsuarioAndContrasenia(String usuario, String contrasenia);
	
	public Optional<Empleado> findByContraseniaAndUsuario( String contrasenia,String usuario);

}
