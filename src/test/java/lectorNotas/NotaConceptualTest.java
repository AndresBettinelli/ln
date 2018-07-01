package lectorNotas;

import static org.junit.Assert.*;
import dominio.calificaciones.NotaConceptual;

import org.junit.Test;

public class NotaConceptualTest {
	
	private NotaConceptual notaS = NotaConceptual.SOBRESALIENTE;
	private NotaConceptual notaB = NotaConceptual.BIEN;
	private NotaConceptual notaR = NotaConceptual.REGULAR;

	@Test
	public void unNotaSEsAprobada() {
		assertTrue(notaS.esAprobada());
	}
	
	@Test
	public void unNotaBEsAprobada() {
		assertTrue(notaB.esAprobada());
	}
	
	@Test
	public void unNotaRNoEsAprobada() {
		assertTrue(!notaR.esAprobada());
	}
	
	@Test
	public void unNotaSDevuelveUnStringS() {
		assertEquals(notaS.getNota(), "S");
	}
}
