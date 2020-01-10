package practica;
/**
 * Clase necesaria para manejar toda la información de las cuentas de los clientes
 * @author josev
 * @version 1.0.0
 */
public class Cuenta {

	private Integer numeroCuenta;
	private Float saldo;
	private Cliente cliente;
	/**
	 * Constructor usado para crear una cuenta sin datos
	 */
	public Cuenta() {
		this.numeroCuenta = 0;
		this.saldo = 0.f;
		this.cliente = null;
	}
	/**
	 * Constructor usado para crear una cuenta con toda la información necesaria
	 * @param numeroCuenta de tipo entero
	 * @param saldo de tipo decimal
	 * @param cliente con la referencia de un cliente ya creado
	 */
	public Cuenta(Integer numeroCuenta, float saldo, Cliente cliente) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	/**
	 * 
	 * @return devuelve el numero de cuenta
	 */
	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}
	/**
	 * 
	 * @param numeroCuenta modifica el numero de cuenta ya creado
	 */
	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	/**
	 * 
	 * @return devuelve el saldo de una cuenta
	 */
	public Float getSaldo() {
		return saldo;
	}
	/**
	 * 
	 * @param saldo modifica el saldo de una cuenta
	 */
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	/**
	 * 
	 * @return devuelve el cliente con toda su información
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * 
	 * @param cliente modifica el cliente propietaro de la cuenta
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * Se sobreescribe el metodo system.out.println para que se muestre como se indica a continuación
	 */
	public String toString() {
		return "Cuenta: " + getNumeroCuenta() + ", con saldo " + getSaldo() + "€, de " + getCliente().getNombre();
	}
	
}
