import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese otro número");
        int numero2 = scanner.nextInt();
        if(numero1>numero2) {
            System.out.println("El 1° número ingresado ("+numero1+") es el mayor");
        } else {
            System.out.println("El 2° número ingresado ("+numero2+") es mayor o igual");
        }

        scanner.close();
    }
}
