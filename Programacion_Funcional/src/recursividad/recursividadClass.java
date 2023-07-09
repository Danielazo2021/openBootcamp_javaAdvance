package recursividad;

import java.util.stream.IntStream;

public class recursividadClass {
    public static void main(String[] args) {

//        System.out.println(suma(5));
//        System.out.println(sumaRecursiva(5));
//        System.out.println("");
//        tailRecursion(10);
//        System.out.println("");
//        headRecursion(10);

        System.out.println(factorialIterativo(5));
        System.out.println(factorialRecursivos(5));
        System.out.println(factorialFuncional(5));
    }
    public static int suma (int max)
    {
        int resultado=0;
        for( int i=0; i<=max; i++)
        {
            resultado+=i;
        }

        return resultado;
    }
    public static int sumaRecursiva(int numero) {
        if (numero == 1)
        {
            return 1;
        }
        return numero + sumaRecursiva( numero-1);
    }


    public static void tailRecursion(int valor){
    if(valor==0)
        return;
        System.out.println(valor);
        tailRecursion(valor-1);
    }

    public static void headRecursion(int valor){
        if(valor==0)
            return;

        headRecursion(valor-1);
        System.out.println(valor);

    }

    public static int sumaFuncional(int numero){
        return IntStream.rangeClosed(1, numero) //.sum();
                .reduce(0,(a,b) -> a + b);
    }


    public static int factorialIterativo(int numero){
        int resultado=1;
        for (int i=1; i<=numero; i++){
            resultado *=i;
        }
        return resultado;
    }
    public static int factorialRecursivos(int numero){
        if(numero==0){
            return 1;
        }
        return numero * factorialRecursivos(numero-1);
    }

    public static int factorialFuncional(int numero){
        return IntStream.rangeClosed(1, numero).reduce(1,(a,b)-> a * b);
    }





}
