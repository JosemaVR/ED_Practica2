package practica;

public class TestBanco {

	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");
 
		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);
 
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

	private static void retirada(Cuenta cuentaBeatriz, Integer cantidad) {
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - cantidad);
	}

	private static void ingreso(Cuenta cuentaAntonio, Integer cantidad) {
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + cantidad);
	}

	private static void transferencia(Cuenta cuentaLlegada, Cuenta cuentaSalida, Integer cantidad) {
		cuentaSalida.setSaldo(cuentaSalida.getSaldo() - cantidad);
		cuentaLlegada.setSaldo(cuentaLlegada.getSaldo() + cantidad);
	}

	private static void consultarSaldo(Cuenta cuenta) {
		System.out.println("La cuenta de " + cuenta.getCliente().getNombre() + " tiene "
				+ cuenta.getSaldo() + " euros.");
	}
}
