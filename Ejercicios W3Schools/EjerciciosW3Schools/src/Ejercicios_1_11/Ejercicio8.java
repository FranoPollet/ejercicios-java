package Ejercicios_1_11;
import java.util.Scanner;

public class Ejercicio8 {
    
    //! PROMEDIO DE NOTAS

    static double promediar(int[] notas) {
        int suma = 0;
        double promedio = 0;
        for (int i=0; i<notas.length; i++){
            suma += notas[i];
        }
        promedio = (suma / notas.length);
        return promedio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[5];
        for (int i=0; i<5; i++) {
            System.out.print("Ingrese la nota "+(i+1)+"° --> ");
            int n = scanner.nextInt();
            notas[i] = n;
        }

        double promedio = promediar(notas);
        System.out.println("El promedio de las notas es de = "+ promedio);

        scanner.close();
            
    }
}
