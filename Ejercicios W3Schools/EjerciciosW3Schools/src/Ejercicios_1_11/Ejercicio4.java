package Ejercicios_1_11;
import java.util.Scanner;

public class Ejercicio4 {
    
    //! CONTADOR DE VOCALES

    static int contadorVocales(String palabra) {
        int contadorVocales = 0;
        String upperPalabra = palabra.toUpperCase();
        //String[] vocales = {"A", "E", "I", "O", "U"};

        for (int i=0; i<palabra.length(); i++) {
            char c = upperPalabra.charAt(i);
            if (c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                contadorVocales++;
            }
        }

        return contadorVocales;
    }

    //?Esto hizo ChatGpt
    /*
    static int contadorVocales(String palabra) {
        int contadorVocales = 0;
        String upperPalabra = palabra.toUpperCase();
        char[] vocales = {'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < palabra.length(); i++) {
            char c = upperPalabra.charAt(i);
            for (char v : vocales) {
                if (c == v) {
                    contadorVocales++;
                    break;
                }
            }
        }

        return contadorVocales;
    }*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("Ingrese una palabra para saber cuantas vocales tiene");
        System.out.print("--> ");
        String palabra = scanner.nextLine();
        int resultado = contadorVocales(palabra);
        System.out.println("Su palabra ("+palabra+") tiene: "+resultado+" vocales");

        scanner.close();
    }
}
