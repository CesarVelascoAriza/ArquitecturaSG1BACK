package co.edu.ucentral.servicio.envios.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.common.envio.modelo.Envio;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.envios.service.EnvioService;

@RestController
public class EnvioController extends CommonsController<Envio, EnvioService>{

	
	@PostMapping("/crear-envio-usuario")
	public ResponseEntity<?> guardarEnvio(@Valid @RequestBody Envio envio, BindingResult result){
		if(result.hasErrors())
			this.validar(result);
		service.crearUsuario(envio.getUsuarioEmisor());
		service.crearUsuario(envio.getUsuarioReceptor());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(envio));
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizarEstado(@PathVariable Long id, @Valid @RequestBody Envio envio,BindingResult result){
		if(result.hasErrors())
			this.validar(result);
		Optional<Envio> optional = service.findById(id);
		if(!optional.isPresent())
			return ResponseEntity.noContent().build();
		Envio envioDB= optional.get();
		envioDB.setEstado(envio.getEstado());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(envioDB));
		
	}
	@GetMapping("/listado-estado-admincion")
	public ResponseEntity<?> listadoAdminicion(@RequestParam Long[] id){
		return ResponseEntity.ok().body(service.listadoEnvioPorAdmicion(id));
	}
	
	@PostMapping("/listado-estado-admincion-2")
	public ResponseEntity<?> listadoAdminicionDos(@RequestParam Long[] id){
		return ResponseEntity.ok().body(service.listadoEnvioPorAdmicion(id));
	}
	
	@PostMapping("/listado-por-usuario-fecha")
	public ResponseEntity<?> listadoPorUsuarioYFecha(@RequestParam Long id, @RequestParam String fechaInicial, @RequestParam  String fechaFinal) throws ParseException{
		return ResponseEntity.ok().body(service.buscarPorFechasYUsuario(id, new SimpleDateFormat("yyyy-MM-dd").parse(fechaInicial) , new SimpleDateFormat("yyyy-MM-dd").parse(fechaFinal)));
	}
	
	
}
