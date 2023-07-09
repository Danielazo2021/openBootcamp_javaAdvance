package com.functions;

import java.util.ArrayList;
import java.util.function.Function;

public class lamda {



    private static Function<String,String> toMayusc= x -> x.toUpperCase(); //esta es una funcion de alto nivel...
    private static Function<Integer,Integer> sumador= x -> x.sum(x,100);


    public static String diHola(String nombre){ // aca hace lo mismo pero es un metodo no una funcion
        return nombre.toUpperCase();
    }



    public static void main(String[] args) {

        System.out.println(toMayusc.apply("DAniel"));

        System.out.println(sumador.apply(30));
        System.out.println(sumador.apply(150));
        System.out.println(sumador.apply(230));

        saluda(toMayusc, "daniel");


    }
    public static void saluda(Function<String,String> miFuncion, String nombre){
        System.out.println(miFuncion.apply(nombre));

    }

}
