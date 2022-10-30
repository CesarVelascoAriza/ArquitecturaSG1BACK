package co.edu.ucentral.servicio.ouath.clienteFeing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.ucentral.commons.usuario.models.Usuario;

@FeignClient(name = "servicio-usuario")
public interface UsuarioFeingCliente {

	@GetMapping("/buscar-username")
	public Usuario buscarPorUserName(@RequestParam("username") String username);
}
