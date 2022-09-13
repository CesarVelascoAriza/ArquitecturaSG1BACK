package co.edu.ucentral.common.empleado.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.edu.ucentral.commons.usuario.models.Autenticacion;
import co.edu.ucentral.commons.usuario.models.TipoDocumento;

@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long numeroDocumento;
	@ManyToOne
	@JoinColumn(name = "tipo_id")
	private TipoDocumento tipo;
	private String nombre;
	private String apellido;
	@Temporal(TemporalType.DATE)
	private Date fechaNacimeinto;
	@ManyToOne
	@JoinColumn(name = "id_rol")
	private Rol rol;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "correo", nullable = false, unique = true)	
	private Autenticacion correo;
	

	public Empleado() {
	}
	
	
	public Empleado(Long numeroDocumento, TipoDocumento tipo, String nombre, String apellido, Date fechaNacimeinto,
			Rol rol, Autenticacion coreo) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.tipo = tipo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimeinto = fechaNacimeinto;
		this.rol = rol;
		this.correo = coreo;
	}


	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}

	public Long getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(Long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
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

	public Date getFechaNacimeinto() {
		return fechaNacimeinto;
	}

	public void setFechaNacimeinto(Date fechaNacimeinto) {
		this.fechaNacimeinto = fechaNacimeinto;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Autenticacion getCoreo() {
		return correo;
	}

	public void setCoreo(Autenticacion coreo) {
		this.correo = coreo;
	}
	

}
