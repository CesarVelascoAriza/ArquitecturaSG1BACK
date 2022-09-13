package co.edu.ucentral.servicio.empleado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({
	
	"co.edu.ucentral.common.empleado.model",
	"co.edu.ucentral.commons.usuario.models"
})
public class ServicioEmpleadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioEmpleadoApplication.class, args);
	}

}
