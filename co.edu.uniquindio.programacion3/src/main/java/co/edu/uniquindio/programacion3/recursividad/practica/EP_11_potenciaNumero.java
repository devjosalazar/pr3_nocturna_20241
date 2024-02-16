package co.edu.uniquindio.programacion3.recursividad.practica;

import java.io.IOException;

public class EP_11_potenciaNumero {

	/**
	8.	Programar un algoritmo recursivo que permita calcular y retornar cualquier potencia para cualquier n�mero.
	**/
	
	
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		int base = 2;
		int potencia = 4;
		
//		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Introduzca la base:");
//		base = Integer.parseInt(entrada.readLine());
//
//		BufferedReader entrada2 = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Introduzca la potencia:");
//		potencia = Integer.parseInt(entrada2.readLine());
		
		
		System.out.println(calcularPotencia(base,potencia));

	}

	private static int calcularPotencia(int base, int potencia) 
	{
		
		if(potencia == 1)
		{
			return base;
		}
		else
		{
			return calcularPotencia(base, potencia-1)*base;
		}
		
		
	}

}
