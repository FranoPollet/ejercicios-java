package Ejercicios_1_11;


import java.util.Scanner;

public class Ejercicio2 {
    
    //!NÚMERO PAR O IMPAR

    static boolean esPar(int num) {
        return num%2==0 ? true:false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Determinamos si su número es Par o Impar");
        System.out.print("Ingrese un número entero -->");
        int num = scanner.nextInt();
        if (esPar(num)){
            System.out.println("El número "+num+" es Par");
        } else {
            System.out.println("El número "+num+" es Impar");
        }
        //System.out.println("Es Par? "+esPar(num));


        scanner.close();
    }
}
