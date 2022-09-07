package co.edu.ucentral.servicio.atenticacion.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.ucentral.commons.usuario.models.Autenticacion;
import co.edu.ucentral.commons.usuario.models.Usuario;

public interface AutenticacionReposository extends JpaRepository<Autenticacion, Long> {

	@Query("select NEW co.edu.ucentral.commons.usuario.models.Usuario(u.numeroDocumento, "
			+ "u.tipo,"
			+ "u.nombre,"
			+ "u.apellido,"
			+ "u.direccion,"
			+ "u.correo,"
			+ "u.telefono"
			+ ") from Autenticacion a  JOIN Usuario u on a.usuario = u.correo.usuario where a.usuario = ?1 and a.contrasenia=?2  ")
	public Optional<Usuario> findByUsuarioAndContrasenia(String usuario,String contrasenia);
}
