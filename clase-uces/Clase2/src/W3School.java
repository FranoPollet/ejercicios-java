public class W3School {

    
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: "+maxSpeed+"Km/h");
    }


    public static void main(String[] args) {
        
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the array
        for (int age : ages) {
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average age is: " + avg);


        //Ejemplo con las los métodos creados arriba --> fullThrottle() & speed(int maxSpeed)
        W3School car1 = new W3School();
        car1.fullThrottle();
        car1.speed(342);

    }
    
}
