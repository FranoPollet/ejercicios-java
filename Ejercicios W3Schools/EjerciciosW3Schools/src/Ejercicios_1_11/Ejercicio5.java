package Ejercicios_1_11;
import java.util.Scanner;

public class Ejercicio5 {
    
    //! TABLA DE MULTIPLICAR

    static void tablaMultiplicar(int num) {
        for (int i=1; i<11; i++) {
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TABLA DE MULTIPLICAR");
        System.out.println("Ingrese un número para mostrar su tabla de multiplicar del 1 al 10");
        System.out.print("--> ");
        int num = scanner.nextInt();
        tablaMultiplicar(num);

        scanner.close();
    }
}
