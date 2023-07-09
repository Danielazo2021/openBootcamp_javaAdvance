public class Main {

    private static int contador=0;

    public static void main(String[] args) {
    int result = suma(2,1);
    int result2= suma(2,1);
        System.out.println(result+" " + result2);



    }
    public static int suma(int a , int b){
        contador +=1;

        return a + b;
    }

    public static int multiplica(int a , int b){

        return a + b;
    }

    //funciones dealto nivel
    public static int devuelve(String cadena){
        return cadena.length(); //esta devolviendo una funcion
    }



}