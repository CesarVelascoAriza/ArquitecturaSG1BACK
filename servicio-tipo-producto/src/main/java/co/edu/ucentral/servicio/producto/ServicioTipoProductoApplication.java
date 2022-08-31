package co.edu.ucentral.servicio.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(
		{"co.edu.ucentral.commons.model"}
		)
public class ServicioTipoProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTipoProductoApplication.class, args);
	}

}
