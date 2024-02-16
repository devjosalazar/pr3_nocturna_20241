package co.edu.uniquindio.programacion3.recursividad.practica;

public class EP_05_numeroApariciones {

	public static void main(String[] args) {
		
		
		int [] arreglo = new int[5];
		arreglo[0] = 1;
		arreglo[1] = 1;
		arreglo[2] = 1;
		arreglo[3] = 8;
		arreglo[4] = 5;
		
		int inicio = 0;
		int fin = arreglo.length-1;
		int elem  = 1;
		int apariciones = 0;
		
		apariciones = numeroApariciones(arreglo, inicio, fin, elem);
		
		System.out.println("N�mero de apariciones = "+ apariciones);

	}

	public static int numeroApariciones(int arreglo[], int inicio, int fin, int elem) {

		if(inicio == fin) {
			if(arreglo[inicio] == elem) {
				return 1;
			}else {
				return 0;
			}
		}else {
			if(arreglo[fin]!=elem) {
				return numeroApariciones(arreglo, inicio, fin-1, elem);
			}else {
				return 1 + numeroApariciones(arreglo, inicio, fin-1, elem);
			}
		}

	}
}
