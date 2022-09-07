package co.edu.ucentral.servicio.usuario.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.commons.usuario.models.Usuario;
import co.edu.ucentral.servicio.usuario.service.UsuarioService;

@RestController
public class UsuarioContoller extends CommonsController<Usuario, UsuarioService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarUsuario(@Valid @RequestBody Usuario usuario, @PathVariable Long id){
		Optional<Usuario> optional =service.findById(id);
		if(!optional.isPresent()) {
			ResponseEntity.notFound().build();
		}
		Usuario usuarioDb= optional.get();
		usuarioDb.setNombre(usuario.getNombre());
		usuarioDb.setApellido(usuario.getApellido());
		usuarioDb.setDireccion(usuario.getDireccion());
		usuarioDb.setTelefono(usuario.getTelefono());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(usuarioDb));
		
	}
}
