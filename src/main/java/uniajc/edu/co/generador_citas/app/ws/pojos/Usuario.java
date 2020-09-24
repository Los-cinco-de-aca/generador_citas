package uniajc.edu.co.generador_citas.app.ws.pojos;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "usuario")
@JsonInclude(value = Include.NON_NULL)
public class Usuario implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Integer idUsuario;
	private String documento;
	private String nombre;
	private String apellido;
	private String genero;
	private Date fechaNacimiento;
	private String telefono;
	private String direccion;
	private String email;
	private String contrasena;
	
	public Usuario(){
		
	}
	
	public Usuario(Usuario usuario) {
		this.idUsuario = usuario.idUsuario;
		this.documento = usuario.documento;
		this.nombre = usuario.nombre;
		this.apellido = usuario.apellido;
		this.genero = usuario.genero;
		this.fechaNacimiento = usuario.fechaNacimiento;
		this.telefono = usuario.telefono;
		this.direccion = usuario.direccion;
		this.email = usuario.email;
		this.contrasena = usuario.contrasena;
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_usuario")
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	@Column(name="documento")
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	@Column(name="nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name="apellido")
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	@Column(name="genero")
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Column(name="fecha_nacimiento")
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Column(name="telefono")
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Column(name="direccion")
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="contrasena")
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", documento=" + documento + ", nombre=" + nombre + ", apellido="
				+ apellido + ", genero=" + genero + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", email=" + email + ", contrasena=" + contrasena + "]";
	}
}
