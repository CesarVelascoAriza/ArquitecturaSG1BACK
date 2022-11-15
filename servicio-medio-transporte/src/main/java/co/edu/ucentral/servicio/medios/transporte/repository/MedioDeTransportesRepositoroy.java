package co.edu.ucentral.servicio.medios.transporte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.despacho.model.MedioTransporte;

public interface MedioDeTransportesRepositoroy extends JpaRepository<MedioTransporte, Long> {

}
