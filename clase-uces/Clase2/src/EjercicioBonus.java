import java.util.Random;
import java.util.Scanner;

public class EjercicioBonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();        
        jugar(scanner, random);
        scanner.close();
    }

    //!Método que crea el array de números aleatorios
    public static int[] crearAleatorios(Random random) {
        int[] numerosAleatorios = new int[5];

        for (int i=0; i<5; i++){
            int aleatorio = random.nextInt(10)+1;
            numerosAleatorios[i]=aleatorio;
        }
        return numerosAleatorios;
    }

    //!Método Jugar donde están los intentos por jugador
    public static void jugar(Scanner scanner, Random random) {
        boolean[] resultados = new boolean[10];

        int[] numerosAleatorios = crearAleatorios(random);

        //!Mostramos la lista de numeros aleatorios creada
        for (int i=0; i<5; i++) {
            System.out.print("["+numerosAleatorios[i]+"]");
        }

        System.out.println("\n"); //*Salto de línea

        //!Intentos Jugador 1
        System.out.println("Turno del jugador 1");
        for (int i=0; i<5; i++) {
            System.out.print("Intento "+(i+1)+"° "+ "Ingresa tu número: ");
            int num = scanner.nextInt();
            if (num==numerosAleatorios[i]) {
                resultados[i] = true;
            } else {
                resultados[i] = false;
            }
        }
        System.out.println(); //*Salto de línea
        //!Intentos Jugador 2 
        System.out.println("Turno del jugador 2");
        for (int i=0; i<5; i++) {
            //int aleatorio = random.nextInt(10)+1;
            System.out.print("Intento "+(i+1)+"° "+ "Ingresa tu número: ");
            int num = scanner.nextInt();
            if (num==numerosAleatorios[i]) {
                resultados[i+5] = true;
            } else {
                resultados[i+5] = false;
            }
        }

        mostrarResultados(resultados);
        
    } 

    //!Método para Mostrar los Resultados de los jugadores
    public static void mostrarResultados(boolean[] resultados){
        int aciertosJugador1 = 0;
        int aciertosJugador2 = 0;

        //TodoAcumulamos los acierto de cada jugador
        for (int i=0; i<5; i++){
            if (resultados[i]==true){
                aciertosJugador1+=1;
            }
        }
        for (int i=5; i<10; i++){
            if (resultados[i]==true){
                aciertosJugador2+=1;
            }
        }

        System.out.println("\n\n\n||RESULTADOS||\n");

        //TODOMostramos quien fue el ganador
        if (aciertosJugador1>aciertosJugador2){
            System.out.println("\nEl ganador es el JUGADOR 1\nFelicitaciones!");
        } else if (aciertosJugador2>aciertosJugador1){
            System.out.println("\nEl ganador es el JUGADOR 2\nFelicitaciones!");
        } else {
            System.out.println("\nEmpate");
        }

        //TODOIndicamos si algún jugador acertó todos los puntos
        if (aciertosJugador1==5 || aciertosJugador2==5) {
            System.out.println("\n\nHubo un jugador que acertó todos los puntos");
        }

        //TODOIndicamos si algún jugador acertó al menos un punto
        if ((aciertosJugador1>0 && aciertosJugador1<5) || (aciertosJugador2>0 && aciertosJugador2<5)){
            System.out.println("\n\nHubo un jugador que acertó al menos un punto");
        }

        //TODODesglose general de los resultados de cada jugador
        //!Resultados Jugador 1
        System.out.println("\nResultados del jugador 1:");
        for (int i=0; i<5; i++) {
            System.out.println("Ingento "+(i+1)+"° : "+resultados[i]);
        }
        //!Resultados Jugador 2
        System.out.println("\nResultados del jugador 2:");
        for (int i=5; i<10; i++) {
            System.out.println("Ingento "+(i-4)+"° : "+resultados[i]);
        }
    }
}
