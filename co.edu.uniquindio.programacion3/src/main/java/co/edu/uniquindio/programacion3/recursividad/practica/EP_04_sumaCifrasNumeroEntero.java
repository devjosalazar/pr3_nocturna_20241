package co.edu.uniquindio.programacion3.recursividad.practica;

public class EP_04_sumaCifrasNumeroEntero {

	public static void main(String[] args) {
		
		int n = 2345;
		int sumaCifras = 0;
		sumaCifras = sumaCifras(n);

	}

	public static int sumaCifras(int n) {

		if (n < 10) {
			return n;
		} else {
			return sumaCifras(n / 10) + n % 10;
		}
	}
	
	
}
