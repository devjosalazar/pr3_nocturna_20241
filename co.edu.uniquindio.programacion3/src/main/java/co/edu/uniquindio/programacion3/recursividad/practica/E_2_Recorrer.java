package co.edu.uniquindio.programacion3.recursividad.practica;

import java.util.ArrayList;

public class E_2_Recorrer {

	public static void main(String[] args) {
		
		int [][] matriz = {
				{1,2,3},
				{3,4,5},
				{6,4,5}};
		String [][] matrizPalabras = {
				{"hola","como"},
				{"van","todos"}};
		int i=0,j=0;
		recorrerMatriz(matriz,i,j);
//		ArrayList<String> listasPalabras = new ArrayList<String>();
//		recorrerMatriz(matrizPalabras, i, j, listasPalabras);
	}

	private static void recorrerMatriz(int[][] matriz, int i, int j){
		if(i <= matriz.length-1){
			if(j <=matriz[i].length-1){
				System.out.print(matriz[i][j]);
				if(j == matriz[i].length-1)	{
					i++;
					j=0;
					System.out.println();
				}else{
					j++;
				}
				recorrerMatriz(matriz, i, j);
			}
		}
	}


	private static void recorrerMatriz(String[][] matriz, int i, int j, ArrayList<String> listasPalabras){
		if(i <= matriz.length-1){
			if(j <=matriz[i].length-1){	
				String palabra = matriz[i][j];
				if(verificarVocalesSeguidas(palabra) == true)
					listasPalabras.add(palabra);
				
				if(j == matriz[i].length-1)	{
					i++;
					j=0;
					System.out.println();
				}else{
					j++;
				}
				recorrerMatriz(matriz, i, j,listasPalabras);
			}
		}
	}
	
	
	private static boolean verificarVocalesSeguidas(String palabra) {
		// TODO Auto-generated method stub
		return false;
	}

}
