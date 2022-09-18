package co.edu.ucentral.servicio.despacho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({
	"co.edu.ucentral.common.despacho.model"
})
public class ServicioDespachoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioDespachoApplication.class, args);
	}

}
