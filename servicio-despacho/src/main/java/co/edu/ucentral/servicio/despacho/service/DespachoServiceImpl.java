package co.edu.ucentral.servicio.despacho.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.common.despacho.model.Despacho;
import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.servicio.despacho.repository.DespachoRepository;

@Service
public class DespachoServiceImpl extends CommonsServiceImpl<Despacho, DespachoRepository> implements DespachoService{

}
