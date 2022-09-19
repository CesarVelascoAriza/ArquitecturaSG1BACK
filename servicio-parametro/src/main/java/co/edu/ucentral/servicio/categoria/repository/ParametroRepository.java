package co.edu.ucentral.servicio.parametro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.commons.model.Categoria;

public interface ParametroRepository extends JpaRepository<Categoria, Long>{

	
}
