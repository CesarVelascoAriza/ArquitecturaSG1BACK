package co.edu.ucentral.servicio.despacho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EntityScan({
	"co.edu.ucentral.common.despacho.model",
	"co.edu.ucentral.commons.estado.model",
	"co.edu.ucentral.common.envio.modelo",
	"co.edu.ucentral.common.oficina.model",
	"co.edu.ucentral.commons.usuario.models",
	"co.edu.ucentral.commons.model"
})
@EnableEurekaClient
@EnableFeignClients
public class ServicioDespachoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioDespachoApplication.class, args);
	}

}
