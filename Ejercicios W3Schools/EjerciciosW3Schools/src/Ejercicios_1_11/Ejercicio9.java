package Ejercicios_1_11;
public class Ejercicio9 {

    static int determinarMayor(int[] array){
        int mayor = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]>mayor){
                mayor = array[i];
            }
        }
        return mayor;
    }

    static int determinarMenor(int[] array){
        int menor = 0;
        for (int i=0; i<array.length; i++){
            if (i==0 || array[i]<menor){
                menor = array[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int[] array = {8, 21, 3, 15, 17, 22, 18, 24, 81, 50};
        int menor, mayor;
        menor = determinarMenor(array);
        mayor = determinarMayor(array);
        System.out.println("El mayor número de nuestro array es: "+mayor);        
        System.out.println("El menor número de nuestro array es: "+menor);
    }

}