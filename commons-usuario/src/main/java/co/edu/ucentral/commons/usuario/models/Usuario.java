package co.edu.ucentral.commons.usuario.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	private String numeroDocumento;
	@ManyToOne
	@JoinColumn(name = "tipo_id")
	private TipoDocumento tipo;
	@Column(length = 30)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 4 ,max = 30, message = "no puede ser menor de 4 o mayor de 30")
	private String nombre;
	@Column(length = 30)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 4 ,max = 30, message = "no puede ser menor de 4 o mayor de 30")
	private String apellido;
	@Column(length = 30)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 8 ,max = 30, message = "no puede ser menor de 8 o mayor de 30")
	private String direccion;
	@Column(length = 60)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 15 ,max = 60, message = "no puede ser menor de 15 o mayor de 60")
	private String correo;
	@Column(length = 15)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 8 ,max = 11, message = "no puede ser menor de 8 o mayor de 11")
	private String telefono;
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
	
}
