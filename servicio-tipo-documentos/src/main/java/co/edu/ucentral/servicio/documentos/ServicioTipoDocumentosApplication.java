package co.edu.ucentral.servicio.documentos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan({
	"co.edu.ucentral.commons.usuario.models"
})
public class ServicioTipoDocumentosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioTipoDocumentosApplication.class, args);
	}

}
