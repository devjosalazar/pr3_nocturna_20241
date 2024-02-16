package co.edu.uniquindio.programacion3.recursividad.practica;

public class EP_03_numeroMenorArreglo {

	public static void main(String[] args) {
		
		int [] vector = new int[5];
		vector[0] = 2;
		vector[1] = 3;
		vector[2] = 1;
		vector[3] = 8;
		vector[4] = 5;
		
		int inicio = 0;
		int fin = vector.length-1;
		int menor  = 0;
		
		menor = numeroMenor(vector, inicio, fin); 
		
		System.out.println("El menor del arreglo es: "+menor);


	}

	public static int numeroMenor(int vector[], int inicio, int fin) {
		if(inicio == fin) {
			return vector[inicio];			
		}else {
			int menor = numeroMenor(vector, inicio + 1, fin);
			
			if(menor < vector[inicio]) {
				return menor;
			}else {
				return vector[inicio];
			}
		}
	}
	
}
