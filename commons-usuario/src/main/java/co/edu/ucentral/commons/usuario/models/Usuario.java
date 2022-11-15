package co.edu.ucentral.commons.usuario.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	private String direccion;
	@Column(length = 60)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 8, max = 60, message = "no puede ser menor de 8 o mayor de 60")
	private String correo;
	@Column(length = 15)
	@NotEmpty(message = "no puede estar vacio")
	@Size(min = 8, max = 11, message = "no puede ser menor de 8 o mayor de 11")
	private String telefono;
	@Column(length = 30,unique = true)
	private String username;
	private String password;
	private Boolean enabled; 
	@JsonIgnoreProperties(allowGetters = true)
	@ManyToMany
	@JoinTable(name = "usuario_roles", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "role_id"), uniqueConstraints = @UniqueConstraint(columnNames = {
			"usuario_id", "role_id" }))
	private List<Rol> roles;
	
	public Usuario() {

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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public List<Rol> getRoles() {
		return roles;
	}



	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}



	public Boolean getEnabled() {
		return enabled;
	}



	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	
	
}
