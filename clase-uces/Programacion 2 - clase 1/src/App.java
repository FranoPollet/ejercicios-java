import java.util.Scanner;

public class App {


    public static void saludar() {
        System.out.println("Hola!");
    }

    public static void saludarA(String nombre) {
        System.out.println("Hola! "+nombre);
    }

    public static String devolverSaludo(String nombre) {
        return "Hola "+ nombre + " ¿Cómo estas?";
    }

    

    public static void main(String[] args) throws Exception {

        
        //Tipos de datos primitivos

        int numero = 10;
        System.out.println(numero);

        boolean bandera = true;
        System.out.println(bandera);

        double conDecimales = 10.3;
        System.out.println(conDecimales);

        float unFloat = 35.3f;
        System.out.println(unFloat);

        ////////////////////////////////////////////

        //Cadenas de caracteres

        String palabra = "MiPalabra";
        System.out.println(palabra);

        char letra = 'n';
        System.out.println(letra);
        

        /*---------------------------------------------*/

        // Como ingresamos datos?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        String nombre = scanner.next();
        System.out.println(devolverSaludo(nombre));
        //saludarA(nombre);
        /*
        System.out.println("Ingrese un número");
        int numero = scarnner.nextInt();    //Esto se encarga de dar el tipo de dato
        System.out.println("Numero ingresado: "+numero);
        */
        scanner.close();
        

        //------------------------------------------------
        
        /*Ejercicio 1:
         * Realizar el “hola mundo”
         * Crear un programa, 
         * que pida el nombre e imprima “Su nombre es ...”
         */
        /*
        System.out.println("Ingrese su nombre");
        Scanner scarnner = new Scanner(System.in);
        char nombre = scarnner.next();
        System.out.println("Hola! Su nombre es "+nombre);
        scarnner.close();
        */
    }

}
