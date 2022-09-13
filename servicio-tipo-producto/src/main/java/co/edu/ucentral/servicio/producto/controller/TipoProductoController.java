package co.edu.ucentral.servicio.producto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.model.ProductosParametros;
import co.edu.ucentral.commons.model.TipoProducto;
import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.servicio.producto.service.TipoProductoService;

@RestController
public class TipoProductoController extends CommonsController<TipoProducto, TipoProductoService> {
	
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@PathVariable Long id ,@Valid @RequestBody TipoProducto producto){
		Optional<TipoProducto> optional = this.service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		TipoProducto productoDb= optional.get();
		productoDb.setProducto(producto.getProducto());
		List<ProductosParametros> eliminados= new ArrayList<ProductosParametros>();
		
		productoDb.getProdutoParametro().forEach(p->{
			if(producto.getProdutoParametro().contains(p)) {
				eliminados.add(p);
			}
		});
		
		eliminados.forEach(e->{
			productoDb.removeParametro(e);
		});
		productoDb.setProdutoParametro(producto.getProdutoParametro());
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(productoDb));
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> guardarConTipo(){
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}

}
