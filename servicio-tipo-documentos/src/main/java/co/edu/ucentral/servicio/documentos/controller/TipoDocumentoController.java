package co.edu.ucentral.servicio.documentos.controller;

import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.commons.services.controller.CommonsController;
import co.edu.ucentral.commons.usuario.models.TipoDocumento;
import co.edu.ucentral.servicio.documentos.service.TipoDocumentoService;

@RestController
public class TipoDocumentoController extends CommonsController<TipoDocumento, TipoDocumentoService> {

}
