package co.edu.ucentral.servicio.envios.FeingClienteUsuario;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.edu.ucentral.commons.usuario.models.Usuario;

@FeignClient(name = "servicio-usuario", url="localhost:8090/api/usuario")
public interface FeingCliente {

	@PostMapping
	public Usuario crear(@RequestBody Usuario usuario);
}
