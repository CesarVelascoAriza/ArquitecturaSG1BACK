package co.edu.ucentral.servicio.estado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.commons.estado.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
