package dominio.calificaciones;

import dominio.excepciones.NotaNoValidaException;;

public class NotaNumerica implements Calificacion{
	private double nota;

	public NotaNumerica(double nota) {
		if (nota > 10 || nota < 0) {
			throw new NotaNoValidaException();
		}
		this.nota = nota;
	}

	public double getNota() {
		return nota;
	}

	public boolean esAprobada() {
		return nota >= 6;
	}
}