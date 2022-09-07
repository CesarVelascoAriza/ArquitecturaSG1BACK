package co.edu.ucentral.servicio.atenticacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({
	"co.edu.ucentral.commons.usuario.models"
})
public class ServicioAutenticacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioAutenticacionApplication.class, args);
	}

}
