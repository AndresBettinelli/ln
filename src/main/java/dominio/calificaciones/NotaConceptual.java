package dominio.calificaciones;

public enum NotaConceptual implements Calificacion {
	MAL("M"), REGULAR("R"), BIEN("B"), SOBRESALIENTE("S");
	
	private String nota;
	
	private NotaConceptual(String nota) {
		this.nota = nota;
	}
	
	public String getNota() {
		return nota;
	}
	
	public boolean esAprobada() {
		return this.ordinal() >= NotaConceptual.BIEN.ordinal();
	}
}