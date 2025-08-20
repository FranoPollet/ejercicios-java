//! SEGUIMOS CON ARRAYS Y MATRICES
//? Continuamos repasando arrays

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);

        //*Para declarar un vector:
        int[] numeros = {4,7,8,1,2};
        imprimir(numeros);  //*Llamamos al método imprimir() que nos muestra nuestro array número por número

        //Todo Ejercicio 1 que nos dió el profe con solo el llamado a la función, nosotros tuvimos que crear la función *
        System.out.println("\nImprimimos los mayores a 10 del array numeros");
        imprimirMayoresA(numeros, 4);

        //? Ejercicio 2: Hay algún elemento Impar en el array?
        System.out.println("\n"+algunElementoImpar(numeros));

        scanner.close();
    }

    private static void imprimir(int[] numeros) {
        for (int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
    //Todo Ejercicio 1
    private static void imprimirMayoresA(int[] numeros, int n){
        for (int i=0; i<numeros.length; i++){
            if (numeros[i]>n) {
                System.out.println(numeros[i]);
            }
        }
    }

    //? Ejercicio 2
    private static boolean algunElementoImpar(int[] numeros){
        //throw new RuntimeException("Completar");
        //*Mi Resolución:
        boolean bandera = false;
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i]%2!=0) {
                bandera = true;
            }
        }
        return bandera;

        //*Resolución del profe:
        //? Dentro del for puso
        //bandera = bandera || numeros[i]%2!=0; en vez del if
        
    }
    
}
