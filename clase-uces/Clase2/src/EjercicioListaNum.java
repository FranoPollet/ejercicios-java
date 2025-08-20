public class EjercicioListaNum {
    //Ejercicio antes de que empiece la diapositiva MATRICES
    public static void main(String[] args) {
        int[] vector = {3,6,9,10,15};

        System.out.println("Son todos multiplos de 3? : "+todosMultiplosTres(vector));

        System.out.println("Hay algún elemnto multiplo de 3? : " + tieneAlgunMultiploTres(vector));
    }

    //Función que devuelve si tiene algun multiplo de tres
    public static boolean tieneAlgunMultiploTres(int[] vector) {
        boolean rta = false;
        for (int i=0; i<vector.length; i++) { 
        
            if(multiploTres(vector[i])) { 
                rta = true;
            }
        }
        return rta;
    } 

    //Función que devuelve si TODOS son multiplos de tres
    public static boolean todosMultiplosTres(int[] vector) {
        boolean rta = false;
        int acumulador = 0;

        for (int i=0; i<vector.length; i++) {
            if (multiploTres(vector[i])) {
                System.out.println(vector[i]+"="+multiploTres(vector[i]));
                acumulador += 1;
            } else {
                System.out.println(vector[i]+"="+multiploTres(vector[i]));
            }
        }
        if (acumulador==vector.length) {
            rta = true;
        }
        return rta;
    }

    //Función que define si es multiplo de tres
    public static boolean multiploTres(int i) { //Recibe un númer entero del vector
        return i%3==0 ? true:false;
    }

    
}
