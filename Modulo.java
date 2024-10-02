
public class Modulo {
    public static void main(String [] args) {
        int totalseconds = 1678;

        // Calculate Minutes
        int minutes = totalseconds / 60;
        
        // Caculate remaining seconds
        int seconds = totalseconds % 60;

        // Print the result
        System.out.println(minutes + " minutes and " + seconds + "seconds");
    }
}
