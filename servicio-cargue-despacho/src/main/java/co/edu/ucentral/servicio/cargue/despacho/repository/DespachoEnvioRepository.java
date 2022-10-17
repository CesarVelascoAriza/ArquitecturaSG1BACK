package co.edu.ucentral.servicio.cargue.despacho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.despacho.model.DespachoEnvios;

public interface DespachoEnvioRepository extends JpaRepository<DespachoEnvios, Long> {

}
