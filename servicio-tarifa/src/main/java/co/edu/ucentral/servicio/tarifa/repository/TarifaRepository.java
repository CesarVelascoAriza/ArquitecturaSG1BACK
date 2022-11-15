package co.edu.ucentral.servicio.tarifa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.commons.model.Tarifa;

public interface TarifaRepository extends JpaRepository<Tarifa, Long> {

	public Tarifa findByValorMinGreaterThanAndValorMaxLessThanEqual(int min, int max);
}
