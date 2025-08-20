import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        
        // Tipos de datos primitivos

        //Números enteros
        int i = 0;
        System.out.println(i);

        //Booleanos
        boolean bandera = true;
        System.out.println(bandera);

        //Decimales - Double
        double decimal = 107.1;
        System.out.println(decimal);

        //Decimales - Float
        float unFloat = 102.2f;
        System.out.println(unFloat);

        //Cadenas de texto - palabras
        String palabra = "palabra";
        System.out.println(palabra);

        //Cadenas de texto - letra
        char letra = 'f';
        System.out.println(letra);


        //Cómo ingresamos datos?
        //Ingreso de caracteres
        Scanner scanner = new Scanner(System.in);       //Importamos y abrimos el scanner

        System.out.println("Ingrese un nombre");      //Mostramos en pantalla q se quiere ingresar
        String nombre = scanner.next();                 //Solicitamos el ingreso de datos
        System.out.println("Hola! "+nombre);            //Mostramos lo ingresado
        


        //Ingreso de números
        
        System.out.println("Ingrese un número");
        int numero = scanner.nextInt();                 //Esto se encarga de dar el tipo de dato
        System.out.println("Usted ingreso el número: "+numero);


        //Ejercicio 1
        System.out.println("Ingrese un nombre");
        String nom = scanner.next();
        System.out.println("Su nombre es... "+nom);


        scanner.close();                                //Cerramos el scanner
    }
    
}
