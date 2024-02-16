package co.edu.uniquindio.programacion3.recursividad.clase;

public class SumaRecursiva {
    public static void main(String[] args) {
        int n = 5;
        int resultado = 0;
        resultado = sumaRecursiva(n);
        System.out.println("Resulatdo= "+resultado);
    }

    private static int sumaRecursiva(int n) {
        if(n == 1){
            return 1;
        }else {
            return sumaRecursiva(n-1)+n;
        }
    }
}
