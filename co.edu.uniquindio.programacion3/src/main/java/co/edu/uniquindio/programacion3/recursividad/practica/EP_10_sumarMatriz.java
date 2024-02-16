package co.edu.uniquindio.programacion3.recursividad.practica;

public class EP_10_sumarMatriz {

	/**
	6.	Programar un algoritmo recursivo que permita sumar los elementos de una matriz. (OK)
	Programar un algoritmo recursivo que permita sumar los elementos de una matriz. 
	El recorrido tiene que ser retrocediendo en en las columnas y avanzando en las filas.
Par�metros( matriz, i, j).

	**/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz [][] = new int[3][3];
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;
		
		int i = 0;
		int j = matriz[0].length;
		
		System.out.println("Resultado de la suma: "+suma(matriz, i, j));
	}
	
	
	static int suma(int[][] matriz, int i, int j) { 
	    if (i != matriz.length) { 
	        if (j > 0) {
	        	System.out.println(matriz[i][j - 1]);
	            return matriz[i][j - 1] + suma(matriz, i, --j); 
	        } else {
	        	j = matriz[i].length;
	            return suma(matriz, ++i, j); 
	        } 
	    } else { 
	        return 0; 
	    } 
	} 


}
