package quintas;

public class Productor {
	private String nombre;
	private String apellido;
	private String telefono;

	public Productor(String nombre, String apellido, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}
	public String contacto() {
		return this.nombre;
	}
	public String referente() {
		return this.apellido;
	}
	public String telefono() {
		return this.telefono;
	}
	public void telefono(String telefono) {
		this.telefono = telefono;
	}
}