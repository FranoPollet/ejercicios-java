import java.util.Scanner;

public class Condicional {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numero = scanner.nextInt();
        int numeroOculto = 51;
        /*
        while(numero!=numeroOculto) {
            System.out.println("Seguí intentado");
            numero = scanner.nextInt();
        }
        if(numero==numeroOculto) {
            System.out.println("Acertó!");
        }
        */
        if(numero==numeroOculto) {
            System.out.println("Acertó!");
        } else {
            System.out.println("No acertó");
        }
        
        scanner.close();
    }
}