package co.edu.uniquindio.programacion3.recursividad.practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EP_13_conteoEnteroVector {

	/**
	1.	Dado un vector de n enteros, el problema a resolver recursivamente consiste en contar el n�mero de veces que un valor dado aparece en dicho vector: 
	Par�metros
	�	el tama�o del vector (n),
	�	el propio vector (vector),
	�	el valor a buscar (objetivo) y
	�	el �ndice del primer elemento del vector a procesar (primero).
	Se debe de hallar:
	�	Identificar el o los casos base
	�	Identificar el caso de recursi�n.
	**/
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int valorBusqueda = 0;
		 int [] vector = {5,4,3,2,1,1,2,4,7,8,1,2,3};
		int n = vector.length;
		int posicionInicial = 0;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduzca el valor a buscar:");
		valorBusqueda = Integer.parseInt(entrada.readLine());
		
		System.out.println("Numero de elementos encotrados: "+contarNumeroEntero_Vector(n,vector,valorBusqueda,posicionInicial));
		
		System.out.println("aca");

	}

	private static int contarNumeroEntero_Vector(int n, int[] vector, int valorBusqueda, int posicion) 
	{
		if(posicion > n-1)
		{
			return 0;
		}
		else
		{
			if(vector[posicion] == valorBusqueda)
			{
				vector[posicion]= 54;
				return 1+ contarNumeroEntero_Vector(n, vector, valorBusqueda, posicion+1);
			}
			else
			{
				return contarNumeroEntero_Vector(n, vector, valorBusqueda, posicion+1);
			}
		}
	}

}
