package co.edu.uniquindio.programacion3.recursividad.clase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arreglo = {1,2,3,4,5};
		int n = 4;
		int resultado = 0;
//		recorrerArreglo(arreglo);
		resultado = sumaEnteros(n);
		System.out.println("REsultado: "+resultado);
	}

	private static void recorrerArreglo(int[] arreglo) {
		for (int i = arreglo.length-1; i >=0 ; i--) {
			System.out.println(arreglo[i]);
		}
	}
	
	private static int sumaEnteros(int n){
		if(n == 1){
			return 1;
		}
		else{
			return sumaEnteros(n-1)+n;
		}
	}

}
