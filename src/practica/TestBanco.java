package practica;
/**
 * Clase de pruebas para consultar y modificar las cuentas
 * @author josev
 * @version 1.0.0
 */
public class TestBanco {
	/**
	 * Constantes usadas durante el test
	 */
	private static final String EUROS = "euros";
	private static final String PROPIETARIO = "La cuenta de ";

	public static void main(String[] args) {
		/**
		 * Creación de clientes
		 */
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
		System.out.println(antonio);
		System.out.println(beatriz);
		
		/**
		 * Creacion de cuentas con los clientes creados previamente
		 */
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
		System.out.println(cuentaAntonio);
		System.out.println(cuentaBeatriz);
		
		/* Antonio y Beatriz consultan el saldo */
		consultarSaldo(cuentaAntonio);
		consultarSaldo(cuentaBeatriz);
 
		/* Beatriz transfiere 50€ a Antonio */
		transferencia(cuentaAntonio, cuentaBeatriz, 50);
		
		/* Antonio y Beatriz consultan el saldo de nuevo */
		consultarSaldo(cuentaAntonio);
		consultarSaldo(cuentaBeatriz);
 
		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		ingreso(cuentaAntonio, 100);
 
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		retirada(cuentaBeatriz, 30);
 
		/* Antonio transfiere 50€ a Beatriz */
		transferencia(cuentaBeatriz, cuentaAntonio, 50);
	}

	/**
	 * Metodo para modificar el saldo de la cuenta al retirar dinero
	 * @param cuenta referencia a la cuenta donde se realiza la retirada
	 * @param cantidad cifra a disminuir en el saldo de la cuenta
	 */
	private static void retirada(Cuenta cuenta, Integer cantidad) {
		cuenta.setSaldo(cuenta.getSaldo() - cantidad);
	}
	/**
	 * Metodo para modificar el saldo de la cuenta al ingresar dinero
	 * @param cuenta referencia a la cuenta donde se realiza el ingreso
	 * @param cantidad cifra a aumentar en el saldo de la cuenta
	 */
	private static void ingreso(Cuenta cuenta, Integer cantidad) {
		cuenta.setSaldo(cuenta.getSaldo() + cantidad);
	}
	/**
	 * Metodo para modificar el saldo de la cuenta al realizar una transferencia, retirando dinero de una cuenta e ingresándolo en otra
	 * @param cuentaLlegada referencia a la cuenta donde se realiza el ingreso
	 * @param cuentaSalida referencia a la cuenta donde se realiza la retirada
	 * @param cantidad cifra a mover de una cuenta a otra
	 */
	private static void transferencia(Cuenta cuentaLlegada, Cuenta cuentaSalida, Integer cantidad) {
		cuentaSalida.setSaldo(cuentaSalida.getSaldo() - cantidad);
		cuentaLlegada.setSaldo(cuentaLlegada.getSaldo() + cantidad);
	}
	/**
	 * Metodo para consultar el saldo actual de una cuenta
	 * @param cuenta referencia a la cuenta consultada
	 */
	private static void consultarSaldo(Cuenta cuenta) {
		System.out.println(PROPIETARIO + cuenta.getCliente().getNombre() + " tiene "
				+ cuenta.getSaldo() + " " + EUROS);
	}
}
