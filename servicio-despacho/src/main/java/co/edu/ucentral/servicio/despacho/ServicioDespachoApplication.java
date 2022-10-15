package co.edu.ucentral.servicio.despacho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan({
	"co.edu.ucentral.common.despacho.model"
})
@EnableEurekaClient
public class ServicioDespachoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioDespachoApplication.class, args);
	}

}
