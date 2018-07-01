package dominio.tareas;

public abstract class Tarea {
	String nombre;
	int maxIntentos;
	public Tarea(String nombre, int maxIntentos) {
		this.nombre = nombre;
		this.maxIntentos = maxIntentos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int maxIntentos() {
		return maxIntentos;
	}

}
