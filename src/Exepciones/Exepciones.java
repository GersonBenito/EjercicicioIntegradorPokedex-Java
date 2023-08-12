package Exepciones;

public class Exepciones {
    public static void main(String[] args){

        int edades[] = {15, 12, 23, 30};

        // ArithmeticException
        try{
            double resultado = 3/0;
            System.out.println(resultado);
        }catch (Exception e){
            System.out.println("No se puede dividir entre 0 " + e);
        }

        // ArrayIndexOutOfBoundsException
        try{
            System.out.println("La edad de la posicion 4 es: " + edades[4]);
        }catch (Exception e){
            System.out.println("Intentaste acceder a un indice que no existe " + e);
        }
    }
}
