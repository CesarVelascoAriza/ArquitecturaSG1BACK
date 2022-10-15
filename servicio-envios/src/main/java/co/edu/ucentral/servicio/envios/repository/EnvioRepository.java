package co.edu.ucentral.servicio.envios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.envio.modelo.Envio;

public interface EnvioRepository extends JpaRepository<Envio, Long>{

}
