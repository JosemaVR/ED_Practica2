package practica;
/**
 * Clase necesaria para manejar la información de los clientes
 * @author josev
 * @version 1.0.0
 */
public class Cliente {
	
	private String dni, nombre, direccion;
	/**
	 * Constructor usado para crear un cliente sin datos
	 */
	public Cliente() {
		this.dni = "";
		this.nombre = "";
		this.direccion = "";
	}
	/**
	 * Constructor usado para crear un cliente con toda la información necesaria
	 * @param dni de tipo texto para que incluya las 8 cifras y la letra del dni
	 * @param nombre de tipo texto que incluye nombre y primer apellido
	 * @param direccion de tipo texto que incluye la direccion completa
	 */
	public Cliente(String dni, String nombre, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	/**
	 * 
	 * @return Devuelve el dni del cliente
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * 
	 * @param dni Para modificar el dni de clientes ya creados
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * 
	 * @return Devuelve el nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre Para modificar el nombre de clientes ya creados
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return Devuelve la direccion del cliente
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * 
	 * @param direccion Para modificar la direccion de clientes ya creados
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * Se sobreescribe el metodo system.out.println para que se muestre como se indica a continuación
	 */
	public String toString() {
		return "Cliente: " + getNombre() + ", " + getDni() + ", direccion (" + getDireccion() + ")";
	}
}
