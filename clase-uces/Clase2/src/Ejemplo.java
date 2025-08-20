public class Ejemplo {
    //El profesor siguio por aca  2
    public static void main(String[] args) {
        
        int[] numeros = {4,5,6, -8};

        int suma = sumar(numeros);
        
        System.out.println("La suma es = " + suma);

        System.out.println("Vector con algún número negativo: "+algunoNegativo(numeros));

        System.out.println("Vector con todos positivos: "+todosPositivos(numeros));
    }

    public static int sumar(int[] numeros) {
        int acumulador = 0;

        for (int i=0; i<numeros.length; i++){
            acumulador += numeros[i];
        }

        return acumulador;
    }

    private static boolean algunoNegativo(int[] numeros) {
        boolean ret = false; //Hipotesis
        for (int i=0; i<numeros.length; i++) {
            ret = ret || (numeros[i]<0); //Dos rayas verticales = o exclusivo
        }
        return ret;
    } 

    private static boolean todosPositivos(int[] numeros) {
        boolean ret = true; // hipotesis
        for (int i=0; i<numeros.length; i++) {
            ret = ret && (numeros[i] > 0); //dos rayas verticales = Y esclusivo
        }
        return ret;
    }
    
}
