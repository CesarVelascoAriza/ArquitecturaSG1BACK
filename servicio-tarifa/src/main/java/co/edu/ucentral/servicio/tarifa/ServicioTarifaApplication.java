package co.edu.ucentral.servicio.tarifa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({
	"co.edu.ucentral.commons.model"
})
@EnableEurekaClient
public class ServicioTarifaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTarifaApplication.class, args);
	}

}
