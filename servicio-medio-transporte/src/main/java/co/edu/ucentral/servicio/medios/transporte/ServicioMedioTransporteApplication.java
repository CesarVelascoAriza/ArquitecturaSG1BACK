package co.edu.ucentral.servicio.medios.transporte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan({
	"co.edu.ucentral.common.despacho.model",
	"co.edu.ucentral.common.envio.modelo",
	"co.edu.ucentral.common.oficina.model",
	"co.edu.ucentral.commons.estado.model",
	"co.edu.ucentral.commons.usuario.models"
})
public class ServicioMedioTransporteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioMedioTransporteApplication.class, args);
	}

}
