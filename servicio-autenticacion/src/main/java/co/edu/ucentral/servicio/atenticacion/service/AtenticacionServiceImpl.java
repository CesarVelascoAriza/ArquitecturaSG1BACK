package co.edu.ucentral.servicio.atenticacion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.usuario.models.Usuario;
import co.edu.ucentral.servicio.atenticacion.repository.AutenticacionReposository;
@Service
public class AtenticacionServiceImpl implements AutenticacionService {

	@Autowired
	private AutenticacionReposository repository;
	
	
	@Override
	public Optional<Usuario>  findByUsuarioAndContrasenia(String usuario, String contrasenia) {
		// TODO Auto-generated method stub
		return repository.findByUsuarioAndContrasenia(usuario, contrasenia);
	}


	/*@Override
	public Optional<Empleado> findByContraseniaAndUsuario(String contrasenia, String usuario) {
		// TODO Auto-generated method stub
		return repository.findEmpleadosByContraseniaAndUsuario(contrasenia, usuario);
	}
	
*/
}
