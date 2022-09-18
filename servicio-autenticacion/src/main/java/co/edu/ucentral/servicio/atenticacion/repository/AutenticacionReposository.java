package co.edu.ucentral.servicio.atenticacion.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.ucentral.commons.usuario.models.Usuario;

public interface AutenticacionReposository extends JpaRepository<Usuario, Long> {
	
	
	public Optional<Usuario> findByUsuarioAndContrasenia(String usuario,String contrasenia);
	
	
	/*@Query("select NEW co.edu.ucentral.common.empleado.model.Empleado("
			+ "e.numeroDocumento, "
			+ "e.tipo,"
			+ "e.nombre,"
			+ "e.apellido,"
			+ "e.fechaNacimeinto,"
			+ "e.rol,"
			+ "e.correo"
			+ ") from Autenticacion a JOIN Empleado e on a.usuario = e.correo.usuario where a.contrasenia =?1 and a.usuario =?2  ")
	public Optional<Empleado> findEmpleadosByContraseniaAndUsuario(String contrasenia,String usuario);
	
	*/
}
