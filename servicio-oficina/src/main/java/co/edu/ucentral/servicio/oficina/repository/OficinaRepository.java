package co.edu.ucentral.servicio.oficina.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.oficina.model.Oficina;

public interface OficinaRepository extends JpaRepository<Oficina, Long> {

}
