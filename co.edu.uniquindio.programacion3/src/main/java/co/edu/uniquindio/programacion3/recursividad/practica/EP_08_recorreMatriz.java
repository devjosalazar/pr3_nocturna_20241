package co.edu.uniquindio.programacion3.recursividad.practica;

/**
 * 
 * Recorrer una matriz de forma recursiva.
 */
public class EP_08_recorreMatriz {
 
    public static void main(String[] args) {
    	
    	
    	int [][] matriz = {
    			{1,2,3},
    			{4,5,6},
    			{7,8,9}
    	};
    	
    	recorrerMatriz(matriz,0,0);
    }
    
	private static void recorrerMatriz(int[][] matriz, int i, int j) {
		
		if(i == matriz.length || j == matriz[i].length){
			System.out.println("Fin de la matriz");
		}else{
			System.out.print(" "+matriz[i][j]);
			if(j == matriz[i].length-1){
				i++;
				j = 0;
				System.out.println("");
			}else{
				j++;
			}
			recorrerMatriz(matriz, i, j);	
		}
	}
    
	private static void recorrerMaztriz(int[][] matriz, int i, int j) {
		if(i <= matriz.length -1)
		{
			if(j <= matriz[i].length-1){
				System.out.print(matriz[i][j]);
				if(j == matriz[i].length-1){
					j=0;
					i++;
					System.out.println();
				}else{
					j++;
				}
				recorrerMaztriz(matriz, i, j);
			}
		}		
	}

	private static void recorrerMatrizV2(int[][] matriz, int i, int j) {
		System.out.print(" "+matriz[i][j]);
		if(i != matriz.length -1 || j != matriz[i].length-1){
			if(j == matriz[i].length-1){
				i++;
				j = 0;
				System.out.println("");
			}else{
				j++;
			}
			recorrerMatriz(matriz, i, j);	
		}
	}
 
 
}