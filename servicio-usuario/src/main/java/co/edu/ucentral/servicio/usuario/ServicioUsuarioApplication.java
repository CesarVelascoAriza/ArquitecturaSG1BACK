package co.edu.ucentral.servicio.usuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({
	"co.edu.ucentral.commons.usuario.models"
})
public class ServicioUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioUsuarioApplication.class, args);
	}

}
