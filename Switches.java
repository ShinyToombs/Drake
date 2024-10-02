public class Switches {
    public static void main(String[] args) {
        int number = -50;
        switch (number >> 31) {
            case 1:
                System.out.println("Positive");
                break;
            case -1:
                System.out.println("Negative");
                break;
            default:
                System.out.println("Zero");
                break;
        }
    }
}