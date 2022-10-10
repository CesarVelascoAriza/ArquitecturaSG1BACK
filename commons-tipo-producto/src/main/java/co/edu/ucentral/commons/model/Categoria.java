package co.edu.ucentral.commons.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categorias")
public class Categoria implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "no puede estar vacio")
	@Size(max = 45,min =2 , message = "dene tener caracteres de 2 a 45" )
	@Column(name = "nombre_cat", length = 45, unique = true)
	private String nombre;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "variable_id")
	private Variable varible;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Variable getVarible() {
		return varible;
	}

	public void setVarible(Variable varible) {
		this.varible = varible;
	}

}
