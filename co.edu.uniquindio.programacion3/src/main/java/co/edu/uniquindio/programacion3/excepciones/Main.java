package co.edu.uniquindio.programacion3.excepciones;

public class Main {
    public static void main(String[] args) {
        ejemplo1();
    }

    private static void ejemplo1() {
        int a = 5;
        int b = 0;
        int c = 0;
        Cliente cliente = null;
        try{
            cliente.setNombre("pedro");
            c = a/b;
            System.out.println("Valor de C: "+c);
        }catch (ArithmeticException | NullPointerException e){
            System.out.println("Se genero un problema: "+e.getMessage());
        }
    }
}
