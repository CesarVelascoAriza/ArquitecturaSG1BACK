package co.edu.ucentral.common.envio.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.edu.ucentral.common.oficina.model.Ciudad;
import co.edu.ucentral.commons.estado.model.Estado;
import co.edu.ucentral.commons.usuario.models.Usuario;

@Entity
@Table(name = "envios")
public class Envio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	@Column(name = "fecha_creacion")
	@Temporal(TemporalType.TIMESTAMP)
	public Date fechaCreacion;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario_emisor")
	private Usuario usuarioEmisor;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "usuario_receptor")
	private Usuario usuarioReceptor;
	@ManyToOne( fetch = FetchType.EAGER)
	@JoinColumn(name = "ciudad_origen")
	private Ciudad ciudadOrigen;
	@JsonIgnoreProperties(allowSetters = true,value = {"Departamento"})
	@ManyToOne( fetch = FetchType.EAGER)
	@JoinColumn(name = "ciudad_destino")
	private Ciudad ciudadDestino;
	private String descripcionEnvio;
	private Float precio;
	@ManyToOne
	@JoinColumn(name = "estado_id")
	private Estado estado;

	@PrePersist
	public void prePersist() {
		fechaCreacion = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Usuario getUsuarioEmisor() {
		return usuarioEmisor;
	}

	public void setUsuarioEmisor(Usuario usuarioEmisor) {
		this.usuarioEmisor = usuarioEmisor;
	}

	public Usuario getUsuarioReceptor() {
		return usuarioReceptor;
	}

	public void setUsuarioReceptor(Usuario usuarioReceptor) {
		this.usuarioReceptor = usuarioReceptor;
	}

	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}
	
	public String getDescripcionEnvio() {
		return descripcionEnvio;
	}

	public void setDescripcionEnvio(String descripcionEnvio) {
		this.descripcionEnvio = descripcionEnvio;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
