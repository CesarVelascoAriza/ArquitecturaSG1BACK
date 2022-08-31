package co.edu.ucentral.commons.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Parametros")
public class Parametro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message = "no puede ser vacio")
	@Size(min = 2 , max = 40, message = "tiene que estar entre 8 y 40 caracteres" )
	@Column(length = 50, name = "descripcion_parametro")
	private String descParam;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescParam() {
		return descParam;
	}
	public void setDescParam(String descParam) {
		this.descParam = descParam;
	}
	
	
	
}
