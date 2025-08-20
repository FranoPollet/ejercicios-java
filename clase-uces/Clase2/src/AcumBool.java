public class AcumBool {
    //De lo anterior sería ver esto 3
    //Ejemplo para saber si un número es par

    public static void main(String[] args) {
        int[] numeros = {32, 12, 5, 15}; 
        System.out.println(tieneAlgunNumeroPar(numeros));
    }

    public static boolean tieneAlgunNumeroPar(int[] numeros) {
        boolean rta = false;
        for (int i=0; i<numeros.length; i++) { 
        
            if(esPar(numeros[i])) { 
                rta = true;
            }
        }
        return rta;
    }

    public static boolean esPar(int i) {
        return i%2==0 ? true:false;
    }
}
