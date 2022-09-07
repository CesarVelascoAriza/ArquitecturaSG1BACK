package co.edu.ucentral.commons.usuario.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long numeroDocumento;
	@ManyToOne
	@JoinColumn(name = "tipo_id")
	private TipoDocumento tipo;
	@Column(length = 30)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 4, max = 30, message = "no puede ser menor de 4 o mayor de 30")
	private String nombre;
	@Column(length = 30)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 4, max = 30, message = "no puede ser menor de 4 o mayor de 30")
	private String apellido;
	@Column(length = 30)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 8, max = 30, message = "no puede ser menor de 8 o mayor de 30")
	private String direccion;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "correo", nullable = false)
	private Autenticacion correo;
	@Column(length = 15)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 8, max = 11, message = "no puede ser menor de 8 o mayor de 11")
	private String telefono;

	
	public Usuario() {

	}
	
	public Usuario(
			Long numeroDocumento, 
			TipoDocumento tipo,
			String nombre,
			String apellido,
			String direccion,
			Autenticacion correo,
			String telefono) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.tipo = tipo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
	}

	public Long getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Autenticacion getCorreo() {
		return correo;
	}

	public void setCorreo(Autenticacion correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
