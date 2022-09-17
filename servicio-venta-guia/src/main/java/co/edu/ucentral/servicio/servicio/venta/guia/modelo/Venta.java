package co.edu.ucentral.servicio.servicio.venta.guia.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import co.edu.ucentral.common.producto.model.Producto;
import co.edu.ucentral.servicio.common.cliente.model.Cliente;

@Entity
@Table(name = "ventas")
public class Venta implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int cantidad;
	private Float valor;
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;
	@JsonIgnoreProperties(value = {"ventas"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	@PrePersist
	public void prePersist() {
		fecha = new Date();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
