package co.edu.ucentral.servicio.medios.transporte.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.despacho.model.MedioTransporte;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.medios.transporte.repository.MedioDeTransportesRepositoroy;
@Service
public class MedioTransporteServiceImp extends CommonsServiceImpl<MedioTransporte, MedioDeTransportesRepositoroy> implements MedioTransporteService {

}
