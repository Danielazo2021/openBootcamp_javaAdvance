package com.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//import static sun.net.www.http.KeepAliveCache.result;


public class masFuncional {
    public static void main(String[] args) {

        ArrayList<String> nombres= new ArrayList<String>();
        nombres.add("Daniel");
        nombres.add("Peter");
        nombres.add("Pedro");
        nombres.stream().forEach(x -> System.out.println(x)); // en vez de hacer un foreach comun y recorrer en 3 lineas

        Stream<String> valores= nombres.stream()
                    .map((x) -> x.toUpperCase())
                .filter((x) -> x.startsWith("P"));


        valores.forEach((x)-> System.out.println(x));


        int[] numeros= {1,2,3,4,5,6,7,8,9,10};

        IntStream stNumeros = Arrays.stream(numeros);
        //IntStream resultado= stNumeros.filter((x)-> x%2==0);
        int resultado= stNumeros.filter((x)-> x%2==0).reduce(0, (x,y)-> {
            System.out.println("X es "+ x);// solo es explicacion
            System.out.println("Y es "+ y); // solo es explicacion
            return x+y;
        })
       ;
        System.out.println("La suma de todos los pares del array es: " +resultado);

     //  resultado.forEach(x-> System.out.print(" "+ x));
    }
}
