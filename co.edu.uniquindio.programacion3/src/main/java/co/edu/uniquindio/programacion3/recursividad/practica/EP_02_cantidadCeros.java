package co.edu.uniquindio.programacion3.recursividad.practica;

public class EP_02_cantidadCeros {

	public static void main(String[] args) {
		
		int [] arreglo = new int[5];
		int cantidadCeros = 0;
		
		arreglo[0] = 0;
		arreglo[1] = 2;
		arreglo[2] = 0;
		arreglo[3] = 1;
		arreglo[4] = 0;
		
		int i = 0;
		
		cantidadCeros = cantidadCerosAvanzando(arreglo, i);
		System.out.println("Cantidad de Ceros = "+ cantidadCeros);
		
		i = arreglo.length-1;
		cantidadCeros = cantidadCerosRetrocediendo(arreglo, i);
		System.out.println("Cantidad de Ceros = "+ cantidadCeros);

		
		
	}

	//Avanzado sobre el arreglo
	private static int cantidadCerosAvanzando(int[] arreglo, int i) {
		
		if(i >= arreglo.length){
			return 0;
		}else{
			
			if(arreglo[i] == 0){
				return cantidadCerosAvanzando(arreglo, i+1)+1;
			}else{
				return cantidadCerosAvanzando(arreglo, i+1);
			}
		}
	}
	
	//Retrocediendo sobre el arreglo
	private static int cantidadCerosRetrocediendo(int[] arreglo, int i) {
		
		if(i < 0){
			return 0;
		}else{
			
			if(arreglo[i] == 0){
				return cantidadCerosRetrocediendo(arreglo, i-1)+1;
			}else{
				return cantidadCerosRetrocediendo(arreglo, i-1);
			}
		}
	}

}
