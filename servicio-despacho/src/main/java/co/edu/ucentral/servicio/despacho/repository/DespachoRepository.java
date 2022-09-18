package co.edu.ucentral.servicio.despacho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.despacho.model.Despacho;

public interface DespachoRepository extends JpaRepository<Despacho, Long> {

}
