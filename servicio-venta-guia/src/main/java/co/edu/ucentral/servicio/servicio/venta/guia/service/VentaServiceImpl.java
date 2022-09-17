package co.edu.ucentral.servicio.servicio.venta.guia.service;



import org.springframework.transaction.annotation.Transactional;

import co.edu.ucentral.commons.services.service.CommonServiceImp;
import co.edu.ucentral.servicio.common.cliente.model.Cliente;
import co.edu.ucentral.servicio.servicio.venta.guia.modelo.Venta;
import co.edu.ucentral.servicio.servicio.venta.guia.repository.VentaRepository;

public class VentaServiceImpl extends CommonServiceImp<Venta, VentaRepository> implements VentaService{

	@Override
	@Transactional(readOnly = true)
	public Iterable<Venta> findByCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return repository.findByCliente(cliente);
	}

}
