package co.edu.ucentral.servicio.cargue.despacho.service;

import java.util.List;

import co.edu.ucentral.common.despacho.model.DespachoEnvios;
import co.edu.ucentral.commons.services.service.CommonsService;

public interface DesapchoEnvioService extends CommonsService<DespachoEnvios> {

	public List<DespachoEnvios> listarDespachosEnvioPorIdEnvio(long id);
}
