public class Ejercicio2 {
    
    public static void main(String[] args) {
        int[] numeros = {30,9,3};
        boolean todosDivisibles3 = todosDivisiblesPorTres(numeros);
        System.out.println("Son todos divisibles? "+ todosDivisibles3);
    }

    private static boolean todosDivisiblesPorTres(int[] numeros) {
        boolean rta = true;
        for (int i=0; i<numeros.length; i++) {
            rta = rta && numeros[i]%3==0;
        }
        return rta; 
    }
}
