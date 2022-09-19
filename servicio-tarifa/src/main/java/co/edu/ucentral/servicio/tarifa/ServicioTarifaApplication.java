package co.edu.ucentral.servicio.tarifa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({
	"co.edu.ucentral.commons.model"
})
public class ServicioTarifaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTarifaApplication.class, args);
	}

}
