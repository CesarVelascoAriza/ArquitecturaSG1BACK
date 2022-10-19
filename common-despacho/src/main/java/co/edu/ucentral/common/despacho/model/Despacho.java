  package co.edu.ucentral.common.despacho.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.edu.ucentral.commons.estado.model.Estado;

@Entity
@Table(name = "despachos")
public class Despacho implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaDespacho;
	private String origen;
	private String destino;
	@JsonIgnoreProperties(allowGetters = true)
	@ManyToOne
	@JoinColumn(name = "vehiculo_id")
	private Vehiculo vehiculo;
	@Column(length = 500)
	private String observaciones;
	@ManyToOne
	@JoinColumn(name = "estado_id")
	private Estado estadoDespacho;
	@JsonIgnoreProperties(value = {"despacho"}, allowSetters = true)
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "despacho",fetch = FetchType.EAGER,orphanRemoval = true)
	List<DespachoEnvios> despachos;
	
	public Despacho() {
		this.despachos= new ArrayList<>();
	}

	@PrePersist
	public void prePersist() {
		fechaDespacho = new Date();
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaDespacho() {
		return fechaDespacho;
	}

	public void setFechaDespacho(Date fechaDespacho) {
		this.fechaDespacho = fechaDespacho;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	
	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Estado getEstadoDespacho() {
		return estadoDespacho;
	}

	public void setEstadoDespacho(Estado estadoDespacho) {
		this.estadoDespacho = estadoDespacho;
	}

	public List<DespachoEnvios> getDespachos() {
		return despachos;
	}

	public void setDespachos(List<DespachoEnvios> despachos) {

		this.despachos.clear();
		despachos.forEach(this::addDespachoEnvio);
	}

	public void addDespachoEnvio(DespachoEnvios despachoEnvio) {
		this.despachos.add(despachoEnvio);
		despachoEnvio.setDespacho(this);
	}
	
	public void removeDespachoEnvio(DespachoEnvios despachoEnvio ) {
		this.despachos.remove(despachoEnvio);
		despachoEnvio.setDespacho(null);
	}

	

}
