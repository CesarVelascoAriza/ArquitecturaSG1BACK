package co.edu.ucentral.commons.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tipo_productos")
public class TipoProducto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 8, max = 40, message = "tiene que estar entre 8 y 40 caracteres")
	@Column(length = 40)
	private String producto;
	@JsonIgnoreProperties(allowSetters = true, value = {"producto"})
	@OneToMany(mappedBy = "producto", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ProductosParametros> produtoParametro;

	public TipoProducto() {
		produtoParametro = new ArrayList<ProductosParametros>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public List<ProductosParametros> getProdutoParametro() {
		return produtoParametro;
	}

	public void setProdutoParametro(List<ProductosParametros> produtoParametro) {
		this.produtoParametro.clear();
		 produtoParametro.forEach(this::addParametro);
	}

	public void addParametro(ProductosParametros parametro) {
		this.produtoParametro.add(parametro);
		parametro.setProducto(this);

	}

	public void removeParametro(ProductosParametros parametro) {
		this.produtoParametro.remove(parametro);
		parametro.setProducto(null);
	}

}