package co.edu.ucentral.servicio.cargue.despacho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({
	"co.edu.ucentral.common.despacho.model",
	"co.edu.ucentral.common.envio.modelo",
	"co.edu.ucentral.common.oficina.model",
	"co.edu.ucentral.commons.model",
	"co.edu.ucentral.commons.usuario.models",
	"co.edu.ucentral.commons.estado.model"
})
public class ServicioCargueDespachoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioCargueDespachoApplication.class, args);
	}

}
