package lectorNotas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dominio.calificaciones.*;
import dominio.tareas.*;
import dominio.Asignacion;;

public class AsignacionTest {

	private List<Calificacion> notasN = new ArrayList<>();
	private List<Calificacion> notasC = new ArrayList<>();
	private Tarea parcial = new Parcial(null);
	private TrabajoPractico tp = new TrabajoPractico(null, 3);
	private Asignacion asignacion;

	@Test
	public void unAsignacionDeUnTPQueSeAgregaUnaBDebeEstarAprobado() {
		
		asignacion = new Asignacion(tp, notasC);
		
		asignacion.agregarNota(NotaConceptual.BIEN);
		assertTrue(asignacion.estaAprobado());
	}
	
	@Test
	public void unAsignacionDeUnTPQueSeAgregaUnaRNoDebeEstarAprobado() {
		
		asignacion = new Asignacion(tp, notasC);
		
		asignacion.agregarNota(NotaConceptual.REGULAR);
		assertFalse(asignacion.estaAprobado());
	}
	
	@Test
	public void unAsignacionDeUnParcialQueSeAgregaUn6DebeEstarAprobado() {
		
		asignacion = new Asignacion(parcial, notasN);
		
		asignacion.agregarNota(new NotaNumerica(6));
		assertTrue(asignacion.estaAprobado());
	}
	
	@Test
	public void unAsignacionDeUnParcialQueSeAgregaUn5NoDebeEstarAprobado() {
		
		asignacion = new Asignacion(parcial, notasN);
		
		asignacion.agregarNota(new NotaNumerica(6));
		assertTrue(asignacion.estaAprobado());
	}
}