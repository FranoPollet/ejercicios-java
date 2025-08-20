package Ejercicios_1_11;
public class Ejercicio10 {
    
    //! INVERTIR ARRAY

    static int[] invertirArray(int[] array){
        int[] arrayInvertido = new int[array.length];
        int j = 0;
        for (int i=array.length-1; i>=0; i--){
            arrayInvertido[j] = array[i];
            j++;
        }
        return arrayInvertido;
    }

    public static void main(String[] args) {
        int[] array = {8, 21, 3, 15, 17, 22, 18, 24, 81, 50};
        int[] arrayInvertido = invertirArray(array);
        System.out.println("Nuestro array invertido queda de la siguiente manera: ");
        for (int i=0; i<arrayInvertido.length; i++){
            System.out.print(arrayInvertido[i]+" ");
        }
    }
}
