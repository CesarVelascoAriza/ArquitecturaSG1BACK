package co.edu.ucentral.servicio.empleado.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.empleado.model.Empleado;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.empleado.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImp extends CommonsServiceImpl<Empleado, EmpleadoRepository> implements EmpleadoService {

}
