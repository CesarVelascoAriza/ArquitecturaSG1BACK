package co.edu.ucentral.servicio.documentos.repostory;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ucentral.commons.usuario.models.TipoDocumento;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumento, Long> {

}
