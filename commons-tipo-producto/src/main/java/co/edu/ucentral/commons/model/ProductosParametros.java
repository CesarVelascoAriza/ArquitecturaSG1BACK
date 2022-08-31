package co.edu.ucentral.commons.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "poductos_parametros")
public class ProductosParametros implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonIgnoreProperties(value = {"producto"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "producto_id")
	private TipoProducto producto;
	@JsonIgnoreProperties(value = {"parametro"})
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "parametro_id")
	private Parametro parametro;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoProducto getProducto() {
		return producto;
	}

	public void setProducto(TipoProducto producto) {
		this.producto = producto;
	}

	public Parametro getParametro() {
		return parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}
	
	

}
