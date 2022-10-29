package co.edu.ucentral.servicio.documentos.service;

import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.services.service.CommonsServiceImpl;
import co.edu.ucentral.commons.usuario.models.TipoDocumento;
import co.edu.ucentral.servicio.documentos.repostory.TipoDocumentoRepository;

@Service
public class TipoDocumentoServiceImp extends CommonsServiceImpl<TipoDocumento, TipoDocumentoRepository> implements TipoDocumentoService {

}
