package co.edu.ucentral.servicio.oficina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({
	"co.edu.ucentral.common.oficina.model"
})
@EnableEurekaClient
public class ServicioOficinaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioOficinaApplication.class, args);
	}

}
