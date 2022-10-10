package co.edu.ucentral.servicio.cargue.despacho.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.edu.ucentral.common.despacho.model.Despacho;

@Entity
@Table(name = "despacho_envios")  
public class DespachoEnvios implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaEntrega;
	@Column(name = "observaciones" ,length = 500)
	private String observaciones;
	@ManyToOne
	@JoinColumn(name = "despacho_id")
	private Despacho despacho;
	@Column(name = "envio_id")
	private Long envio;
	private byte entregado;
	
	@PrePersist
	public void prePersist() {
		fechaEntrega = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Despacho getDespacho() {
		return despacho;
	}

	public void setDespacho(Despacho despacho) {
		this.despacho = despacho;
	}

	public Long getEnvio() {
		return envio;
	}

	public void setEnvio(Long envio) {
		this.envio = envio;
	}

	public byte getEntregado() {
		return entregado;
	}

	public void setEntregado(byte entregado) {
		this.entregado = entregado;
	}
	
	
	
	
}
