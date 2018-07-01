package dominio;

import java.util.Collection;

import dominio.Asignacion;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int legajo;
	private String usuarioGit;
	private Collection<Asignacion> asignaciones;

	public Estudiante(String nombre, String apellido, int legajo, 
			String usuarioGit, Collection<Asignacion> asignaciones) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.usuarioGit = usuarioGit;
		this.asignaciones = asignaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getLegajo() {
		return legajo;
	}

	public String getUsuarioGit() {
		return usuarioGit;
	}

	public Collection<Asignacion> getAsignaciones() {
		return asignaciones;
	}

}
