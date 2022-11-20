package co.edu.ucentral.servicio.envios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.ucentral.common.envio.modelo.Envio;

public interface EnvioRepository extends JpaRepository<Envio, Long>{

	@Query("select e from Envio e where e.estado.id in ?1")
	public List<Envio> findEnvioEstadoByIdIn(Long[] estado);
}
