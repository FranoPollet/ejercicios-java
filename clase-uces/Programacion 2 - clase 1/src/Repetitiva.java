public class Repetitiva {
    
    public static void main(String[] args) {
        
        //Vemos ciclo FOR
        for(int i=0; i < 10; i++) { //Inicio; fin; paso 
            System.out.println(i);
        }
        
        System.out.println("\nFin del ciclo FOR\n");

        //Vemos ciclo WHILE
        int indice = 0;
        while(indice < 10) {
            System.out.println(indice);
            indice++;
        }

        System.out.println("\nFin del ciclo WHILE\n");
        
        //Al while lo usamos cuando no conocemos la condición de fin
        //Con el FOR debemos saber la condición de fin

        //Vemos el DO WHILE
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j<10);
        System.out.println("\nFin del ciclo DO WHILE\n");

    }
}
