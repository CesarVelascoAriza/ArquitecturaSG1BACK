package co.edu.ucentral.servicio.cargue.despacho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.ucentral.common.despacho.model.DespachoEnvios;

public interface DespachoEnvioRepository extends JpaRepository<DespachoEnvios, Long> {

	@Query("select de from DespachoEnvios de right join Envio e on e.id = de.envio.id where e.id=?1 order by de.fechaEntrega desc")
	public List<DespachoEnvios> findDespachoEnviosEnvioByid(Long id);
	
}

