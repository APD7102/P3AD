package POJOS;
// Generated 17-jun-2021 19:49:26 by Hibernate Tools 5.4.21.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clientes generated by hbm2java
 */
@Entity
@Table
public class Clientes implements java.io.Serializable {

	@Id
	@Column(name = "idCliente")
	private Integer idClientes;
	@Column(name = "nombre")
	private String nombre;
	@Column (name ="apellidos")
	private String apellidos;
	@Column (name ="email")
	private String email;
	@Column (name ="dni")
	private String dni;
	@Column (name = "clave")
	private String clave;

	public Clientes(int idClientes2) {
	}

	public Clientes(String nombre, String apellidos, String email, String dni, String clave) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.dni = dni;
		this.clave = clave;
	}

	public Clientes(int idClientes2, String nombreCliente, String apellidosCliente, String emailCliente,
			String dNICliente, String claveCliente) {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdClientes() {
		return this.idClientes;
	}

	public void setIdClientes(Integer idClientes) {
		this.idClientes = idClientes;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

}
