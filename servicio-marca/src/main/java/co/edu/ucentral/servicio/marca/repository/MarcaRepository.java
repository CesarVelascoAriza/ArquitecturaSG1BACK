package co.edu.ucentral.servicio.marca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.despacho.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
