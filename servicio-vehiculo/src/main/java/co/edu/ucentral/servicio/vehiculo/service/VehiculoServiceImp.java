package co.edu.ucentral.servicio.vehiculo.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.despacho.model.Vehiculo;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.vehiculo.repository.VehiculoRepository;

@Service
public class VehiculoServiceImp extends CommonsServiceImpl<Vehiculo, VehiculoRepository> implements VehiculoService{

}
