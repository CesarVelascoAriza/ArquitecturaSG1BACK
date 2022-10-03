package co.edu.ucentral.servicio.envios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({
	
	"co.edu.ucentral.common.empleado.model",
	"co.edu.ucentral.commons.usuario.models",
	"co.edu.ucentral.commons.model"
})
public class ServicioEnviosApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ServicioEnviosApplication.class, args);
	}

}
