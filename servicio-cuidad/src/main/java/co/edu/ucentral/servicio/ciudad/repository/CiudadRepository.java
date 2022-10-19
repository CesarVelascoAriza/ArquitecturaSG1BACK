package co.edu.ucentral.servicio.ciudad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.oficina.model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

}
