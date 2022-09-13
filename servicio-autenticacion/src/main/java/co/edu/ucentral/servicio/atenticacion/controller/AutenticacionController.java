package co.edu.ucentral.servicio.atenticacion.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.empleado.model.Empleado;
import co.edu.ucentral.commons.usuario.models.Autenticacion;
import co.edu.ucentral.commons.usuario.models.Usuario;
import co.edu.ucentral.servicio.atenticacion.service.AutenticacionService;

@RestController
public class AutenticacionController {
	
	@Autowired
	private AutenticacionService service;

	@PostMapping
	public ResponseEntity<?> consutarUsuariosBycontrasenia(@Valid @RequestBody Autenticacion autenticacion){
		Optional<Usuario> optional = service.findByUsuarioAndContrasenia(autenticacion.getUsuario(), autenticacion.getContrasenia());
		Optional<Empleado> optionalEmpleado= service.findByContraseniaAndUsuario(autenticacion.getContrasenia(), autenticacion.getUsuario());
		if(optional.isPresent()) {
			return ResponseEntity.ok().body(optional.get());	
		}else if(optionalEmpleado.isPresent()) {
			return ResponseEntity.ok().body(optionalEmpleado.get());
		}
		return ResponseEntity.notFound().build();
		
	}
}
