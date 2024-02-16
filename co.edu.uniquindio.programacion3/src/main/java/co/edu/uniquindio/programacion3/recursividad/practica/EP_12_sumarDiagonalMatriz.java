package co.edu.uniquindio.programacion3.recursividad.practica;

public class EP_12_sumarDiagonalMatriz {

	/**
	7.	Programar un algoritmo recursivo que permita sumar la diagonal principal de una matriz
	**/
	
	public static void main(String[] args) 
	{
		int n = 3;
		int m = 3;
		
		int matriz [][] = {{10,2,3},{4,10,6},{7,8,10}};
		
		
		System.out.println(sumaDiagonal(matriz,n,m));

	}

	private static int sumaDiagonal(int[][] matriz, int n, int m) 
	{
	    if (n > 0) { 
	        if (m > 0) 
	        {
	        	if((n-1) == (m-1))
	        		return matriz[n - 1][m - 1] + sumaDiagonal(matriz, n, --m);
	        	else
	        		return sumaDiagonal(matriz, n, --m);
	             
	        }
	        else 
	        { 
	            return sumaDiagonal(matriz, --n, m + matriz[n].length); 
	        } 
	    } 
	    else { 
	        return 0; 
	    }
	}

}
