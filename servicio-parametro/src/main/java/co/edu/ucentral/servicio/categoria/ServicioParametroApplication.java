package co.edu.ucentral.servicio.categoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EntityScan(
		{"co.edu.ucentral.commons.model"}
		)

@EnableEurekaClient
public class ServicioParametroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioParametroApplication.class, args);
	}

}
