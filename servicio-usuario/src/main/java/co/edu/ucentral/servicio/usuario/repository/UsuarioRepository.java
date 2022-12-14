package co.edu.ucentral.servicio.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.commons.usuario.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	
	public Usuario findByUsername(String username);;
}
