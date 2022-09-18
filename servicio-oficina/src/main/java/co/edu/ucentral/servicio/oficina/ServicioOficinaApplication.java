package co.edu.ucentral.servicio.oficina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({
	"co.edu.ucentral.common.oficina.model"
})
public class ServicioOficinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioOficinaApplication.class, args);
	}

}
