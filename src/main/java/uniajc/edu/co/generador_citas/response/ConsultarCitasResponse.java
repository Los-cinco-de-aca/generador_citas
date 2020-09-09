package uniajc.edu.co.generador_citas.response;

import java.io.Serializable;

public class ConsultarCitasResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String nombre;
	
	private String mensaje;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
