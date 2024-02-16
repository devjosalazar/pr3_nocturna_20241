package co.edu.uniquindio.programacion3.recursividad.practica;

public class EP_01_cifrasNumeroEntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cifras = 0;
		int numero = 123;
		cifras = obtenerCifrasNumero(numero);
		System.out.println(cifras);
		
		obtenerCifrasV1(numero);
		obtenerCifrasV2(numero);
		obtenerCifrasV3(numero);

	}

	private static int obtenerCifrasNumero(int n){
		if(n < 10){
			return 1;
		}else{
			return obtenerCifrasNumero(n/10)+1;
		}
	}
	
	
	private static void obtenerCifrasV1(int numero){
		String digitos = Integer.toString(numero);
		System.out.println("Tama�o = "+ digitos.length());
	}
	
	private static void obtenerCifrasV2(int numero){
		int contador = 0;
		
		while (numero != 0) {
			numero = numero /10;
			++contador;			
		}
		System.out.println("Tama�ao: "+contador);
	}
	
	
	private static void obtenerCifrasV3(int numero){
		int contador = 0;
		
		for (int i = 0; numero > 0; i++) {
			numero = numero /10;
			++contador;	
		}
		System.out.println("Tama�ao calculado con for: "+contador);
	}
	
}
