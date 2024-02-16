package co.edu.uniquindio.programacion3.recursividad.practica;

/**
 * 
 * Recorrer un array de forma recursiva.
 *
 */
public class EP_06_recorrerArray {
 
    public static void main(String[] args) {
         
        int[] array={1,2,3,4,5}; //Creamos un array
        mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion donde empieza
         
    }
     
    public static void mostrarArrayRecursivo(int[] array, int indice){
         
        if (indice == (array.length-1)){
        	 System.out.println("Valor en la posici�n "+indice+" = "+array[indice]);
        }else{
            System.out.println("Valor en la posici�n "+indice+" = "+array[indice]);
            mostrarArrayRecursivo(array, indice+1);
        }
         
    }
     
     
}