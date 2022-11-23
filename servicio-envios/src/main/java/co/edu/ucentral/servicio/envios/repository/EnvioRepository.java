package co.edu.ucentral.servicio.envios.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.ucentral.common.envio.modelo.Envio;

public interface EnvioRepository extends JpaRepository<Envio, Long>{

	@Query("select e from Envio e where e.estado.id in ?1")
	public List<Envio> findEnvioEstadoByIdIn(Long[] estado);
	@Query("select e from Envio e where e.usuarioEmisor.numeroDocumento = ?1 and e.fechaCreacion between  ?2 and ?3")
	public Iterable<Envio> findEnvioByUsuarioEmisorAndFechaCreacionBetween(Long numero,Date fechaInical,Date fechaFinal ); 
}
