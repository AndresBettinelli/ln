package lectorNotas;

import static org.junit.Assert.*;
import org.junit.Test;
import dominio.calificaciones.NotaNumerica;

public class NotaNumericaTest {

	private NotaNumerica nota7_5 = new NotaNumerica(7.5);
	private NotaNumerica nota7 = new NotaNumerica(7);
	private NotaNumerica nota6 = new NotaNumerica(6);
	private NotaNumerica nota5 = new NotaNumerica(5);

	@Test
	public void sieteComaCincoEsUnaNotaAprobada() {
		assertTrue(nota7_5.esAprobada());	
	}
	
	@Test
	public void sieteEsUnaNotaAprobada() {
		assertTrue(nota7.esAprobada());	
	}
	
	@Test
	public void seisEsUnaNotaAprobada() {
		assertTrue(nota6.esAprobada());	
	}
	
	@Test
	public void cincoNoEsUnaNotaAprobada() {
		assertTrue(!nota5.esAprobada())	;
	}
	
	@Test
	public void unaNotaNumerica7DaUn7ConSugetNote() {
		assertEquals(7.0, nota7.getNota(), 0);
	}

}
