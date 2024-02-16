package co.edu.uniquindio.programacion3.recursividad.clase;

public class MainRecursivo {

    public static void main(String[] args) {
        int [] arreglo = {1,2,1,5,2,3,3,3,3,3};
        int valorBuscado = 3;
        int indice = 0;
        int resultado = 0;
        resultado = buscarValor(arreglo, indice, valorBuscado);
        System.out.println("El numero de apariciones es: "+resultado);
    }

    private static int buscarValor(int[] arreglo, int indice, int valorBuscado) {
        if(indice == arreglo.length-1){
            if(arreglo[indice] == valorBuscado){
                return  1;
            }else {
                return 0;
            }
        }else{
            if(arreglo[indice] == valorBuscado){
                return buscarValor(arreglo, indice+1, valorBuscado);
            }else{
                return buscarValor(arreglo, indice+1, valorBuscado);
            }
        }
    }

    private static int buscarValor2(int[] arreglo, int indice, int valorBuscado) {
        if(indice == arreglo.length-1){
            return verificarValorExiste(arreglo, indice, valorBuscado);
        }else{
            if(arreglo[indice] == valorBuscado){
                return buscarValor(arreglo, indice+1, valorBuscado)+1;
            }else{
                return buscarValor(arreglo, indice+1, valorBuscado);
            }
        }
    }

    private static int verificarValorExiste(int[] arreglo, int indice, int valorBuscado) {
        if(arreglo[indice] == valorBuscado){
            return 1;
        }else {
            return 0;
        }
    }

    private static int verificarValorExiste2(int[] arreglo, int indice, int valorBuscado) {
        return arreglo[indice] == valorBuscado ? 1: 0;
    }

}
