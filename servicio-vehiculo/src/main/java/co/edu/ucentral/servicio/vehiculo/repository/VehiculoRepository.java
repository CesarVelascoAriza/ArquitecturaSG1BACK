package co.edu.ucentral.servicio.vehiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.despacho.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

}
