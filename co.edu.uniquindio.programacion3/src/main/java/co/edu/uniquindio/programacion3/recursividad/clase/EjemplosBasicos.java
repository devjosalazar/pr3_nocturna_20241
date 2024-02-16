package co.edu.uniquindio.programacion3.recursividad.clase;

public class EjemplosBasicos {

	
	static int fib = 0;
	public static void main(String[] args) 
	{
		int n = 5;
		int i= 1;
//		System.out.println("Contexto de ejecuci�n actual: " +i );
//		++i;
		
		System.out.println("suma enteros es:  "+ sumaN_Enteros(n));
//		calcularFactorial(n);
//		calcularFactorial_Iteractio(3);
//		System.out.println(fibonacci(n));
	}
	
	
//-----------------------------------------SUMA DE N N�MEROS ENTEROS--------------------------------------
//--------------------------------------------------------------------------------------------------------	
	//Ejemplo suma de N numeros enteros

//	public static int sumaN_Enteros(int n) {
//		if(n == 1)
//		{
//			return 1;
//		}
//		else
//		{
//			return sumaN_Enteros(n-1) + n;
//		}
//	}


	public static int sumaN_Enteros(int n)
	{
		int resultado = 0;
		if(n == 1)
		{
			return 1;
		}
		else
		{
			resultado = sumaN_Enteros(n-1) + n;
			return resultado;
		}
	}



//-----------------------------------------CALCULAR FACTORIAL DE UN N�MERO--------------------------------
//--------------------------------------------------------------------------------------------------------		
	
	public static int calcularFactorial(int n)
	{
		int resultado = 0;
		
		if(n==1)
		{
			System.out.println("Valor del factorial de "+n+"!= "+1);
			return 1;
		}
		else
		{
			resultado = n * calcularFactorial(n-1);
			System.out.println("Valor del factorial de "+n+"!= "+resultado);
			return resultado;
		}
	}

	
	
//-----------------------------------------CALCULAR FACTORIAL DE UN N�MERO DE FORMA IETRACTIVA------------
//--------------------------------------------------------------------------------------------------------		
	
	public static void calcularFactorial_Iteractio(int n)
	{
		
		int fact = 1;
		
		
		for (int i = 1; i <= n; i++)
		{
			fact = i * fact;
			System.out.println("Valor del factorial de "+i+"!= "+fact);
		}
	}
	
//-----------------------------------------CALCULAR FIBONACCI--------------------------------------
//--------------------------------------------------------------------------------------------------------		
	public static int fibonacci(int n) 
	{
		if(n == 1 || n==0){
			return n;
		}
		else
		{
			return fibonacci(n-1)+ fibonacci(n-2);
		}
	}

}