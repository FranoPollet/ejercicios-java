package Ejercicios_1_11;
import java.util.Scanner;

public class Ejercicio6 {
    
    //!SUMA DE NÚMEROS DEL 1 AL N

    static int sumar(int n){
        int total = 0;
        int i = 1;
        while (i<=n) {
            total += i;
            i++; 
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para saber la sumatoria de todos los números hasta él");
        System.out.print("--> ");
        int num = scanner.nextInt();
        int resultado = sumar(num);
        System.out.println("La sumatoria total desde 1 a "+num+" es de = "+resultado);

        scanner.close();
    }
}
