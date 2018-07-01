package dominio;

import java.util.List;

import dominio.calificaciones.*;
import dominio.excepciones.ImposibleAgregarNotaException;
import dominio.tareas.*;

public class Asignacion {

	private Tarea tarea;
	private List<Calificacion> notas;
	
	public Asignacion(Tarea tarea, List<Calificacion> notas) {
		this.tarea = tarea;
		this.notas = notas;
	}

	public boolean estaAprobado() {
		return notas
				.stream()
				.anyMatch(nota -> nota.esAprobada());
	}

	public void agregarNota(Calificacion nota) {
		if(notas.size() >= tarea.maxIntentos()) {
			throw new ImposibleAgregarNotaException();
		}
		notas.add(nota);
	}

	public int cantidadNotas() {
		return notas.size();
	}
	
	public Calificacion ultimaNota(){
		return notas.get(notas.size() - 1);
	}
	
	public String nombreTarea() {
		return tarea.getNombre();
	}
}