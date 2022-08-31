package co.edu.ucentral.servicio.usuario.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.commons.usuario.models.Usuario;
import co.edu.ucentral.servicio.usuario.service.UsuarioService;

@RestController
public class UsuarioContoller extends CommonsController<Usuario, UsuarioService> {

}
