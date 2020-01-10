package practica;

public class Cliente {

	private String dni, nombre, direccion;

	public Cliente() {
		this.dni = "";
		this.nombre = "";
		this.direccion = "";
	}
	
	public Cliente(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
		return "Cliente: " + nombre + ", " + dni + ", direccion (" + direccion + ")";
	}
}
