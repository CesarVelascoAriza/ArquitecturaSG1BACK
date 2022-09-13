package co.edu.ucentral.servicio.empleado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.common.empleado.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{

}
