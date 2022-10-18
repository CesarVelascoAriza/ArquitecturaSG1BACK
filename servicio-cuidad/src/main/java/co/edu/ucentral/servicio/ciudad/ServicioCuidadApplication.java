package co.edu.ucentral.servicio.ciudad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan({
	"co.edu.ucentral.common.oficina.model"
})
public class ServicioCuidadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioCuidadApplication.class, args);
	}

}
