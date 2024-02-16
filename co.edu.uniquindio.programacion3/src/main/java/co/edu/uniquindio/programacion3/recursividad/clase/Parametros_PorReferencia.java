package co.edu.uniquindio.programacion3.recursividad.clase;

import co.edu.uniquindio.programacion3.recursividad.clase.model.Clase2;
import co.edu.uniquindio.programacion3.recursividad.clase.model.Estudiante;

public class Parametros_PorReferencia
{
	
	
	public static void main(String[] args) 
	{
		//Paso por referencia
		Estudiante pruebaObjeto = new Estudiante();
		System.out.println("Valor del objeto antes de modificar: "+pruebaObjeto.getEdad());
		
		Clase2 clase2 = new Clase2();
		clase2.cambiarValor(pruebaObjeto);
		System.out.println("Valor del objeto al cambiarlo: "+pruebaObjeto.getEdad());
	}

}
