package practica;

public class Cuenta {

	private Integer numeroCuenta;
	private Float saldo;
	private Cliente cliente;
	
	public Cuenta() {
		this.numeroCuenta = 0;
		this.saldo = 0.f;
		this.cliente = null;
	}
	
	public Cuenta(Integer numeroCuenta, float saldo, Cliente cliente) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String toString() {
		return "Cuenta: " + numeroCuenta + " con saldo " + saldo + "€, de " + cliente;
	}
	
}
