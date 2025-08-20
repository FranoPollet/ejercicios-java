import java.util.Scanner;

public class Funciones {


    //Teoría funciones
    public static void saludar() {
        System.out.println("Hola! Cómo estás?");
    }

    public static void saludarA(String nombre) {
        System.out.println("Hola! "+nombre+" ¿Cómo estás?");
    }

    public static String devolverSaludo(String nombre) {
        return "Hola "+ nombre + ", ¿Cómo estuvo tu día?";
    }

    //Realizando el ejercicio 2
    public static void sayName(String nombre) {
        System.out.println("Su nombre es: "+nombre);
    }
    public static String decirNombre(String nombre) {   //Función refactorizada que devuelve un String
        return "Su nombre es: "+nombre;
    }

    public static void main(String[] args) {
        
        //Abrimos scanner
        Scanner scanner = new Scanner(System.in);

        //Correspondiente a la teoría
        System.out.println("Ingrese su nombre");
        String nombre = scanner.next();

        saludar();
        saludarA(nombre);
        System.out.println(devolverSaludo(nombre));

        //Correspondiente al ejercicio 2
        System.out.println("Ingrese un nombre");
        String name = scanner.next();

        sayName(name);
        System.out.println(decirNombre(name));

        //Cerramos scanner
        scanner.close();
    }


}