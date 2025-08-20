package Ejercicios_1_11;
import java.util.Scanner;

public class Ejercicio3 {
    
    //!MAYOR DE TRES NÚMEROS... programa que lee 3 números e indica cuál es el mayor.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mayor = 0;

        for (int i=0; i<3; i++) {
            System.out.print("Ingrese el número "+(i+1)+"° --> ");
            int num = scanner.nextInt();
            if (num>mayor) {
                mayor = num;
            }
        }

        System.out.println("El mayor número ingresado fue el: "+mayor);
        
        scanner.close();
    }
}
