package co.edu.uniquindio.programacion3.recursividad.practica;

public class EP_Matriz_Varios {


	public static void main(String[] args) {
	      int matriz[][]= new int[][]{{8,7,3,8},
	    	  						  {1,7,6,2},
	    	  						  {9,5,0,8},
	    	  						  {2,6,3,2}};


	     System.out.println(sumarDiagonal(matriz,0));
	     System.out.println(sumarDiagonal11(matriz,0));
	     System.out.println(sumarDiagonal2(matriz,0));
	     System.out.println(sumarDiagonal3(matriz,matriz.length));
	     System.out.println(sumarDiagonal4(matriz,matriz.length-1));

	     System.out.println(sumarMatriz(matriz,0,0,0));

	}




	private static int sumarDiagonal(int[][] matriz, int i) {

		if(i <= matriz.length-1 ){
			return matriz[i][i]+sumarDiagonal(matriz, i+1);
		}else{
			return 0;
		}

	}
	
	private static int sumarDiagonal11(int[][] matriz, int i) {

		if(i < matriz.length-1 ){
			return matriz[i][i]+sumarDiagonal11(matriz, i+1);
		}else{
			return matriz[i][i];
		}

	}

	private static int sumarDiagonal2(int[][] matriz, int i) {

		if(i == matriz.length ){
			return 0;
		}else{
			return matriz[i][i]+sumarDiagonal2(matriz, i+1);
		}

	}
	private static int sumarDiagonal22(int[][] matriz, int i) {

		if(i == matriz.length-1 ){
			return matriz[i][i];
		}else{
			return matriz[i][i]+sumarDiagonal22(matriz, i+1);
		}
	}


	private static int sumarDiagonal3(int[][] matriz, int i) {

		if(i <= 0 ){
			return 0;
		}else{
			return matriz[i-1][i-1]+sumarDiagonal3(matriz, i-1);
		}

	}

	private static int sumarDiagonal4(int[][] matriz, int i) {

		if(i < 0 ){
			return 0;
		}else{
			return matriz[i][i]+sumarDiagonal4(matriz, i-1);
		}

	}
	private static int sumarDiagonal41(int[][] matriz, int i) {

		if(i == 0 ){
			return matriz[i][i];
		}else{
			return matriz[i][i]+sumarDiagonal41(matriz, i-1);
		}
	}



	private static int sumarMatriz(int[][] matriz, int i,int j,int suma) {
        System.out.print(matriz[i][j] + " ");

		if(i < matriz.length){
			if(j < matriz[i].length){
				System.out.println("Valor:"+matriz[i][j]);
				j++;
			}else{
				j = 0;
			}
			i++;
		}

		return suma;
	}

	public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {

        //Muestro el numero (sin salto de linea)
        System.out.print(m[i][j] + " ");

        //
        if (i != m.length - 1 || j != m[i].length - 1) {

            //Indico si llego al final de la fila
            if (j == m[i].length - 1) {
                //Paso a la siguiente fila
                i++;
                //Reinicio la j
                j = 0;
                //Salto de linea (solo formato)
                System.out.println("");
            } else {
                //Paso a la siguiente columna
                j++;
            }

            //Volvemos a llamar la funci�n recursivamente
            recorrerMatrizRecursivo(m, i, j);

        }

    }
}
