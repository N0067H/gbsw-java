import java.util.Scanner;
import java.util.InputMismatchException;

class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Fahrenheit: ");
        try {
            double c = 5 * (in.nextDouble() - 31) / 9;
            if (c >= 30) {
                System.out.println("Hot");
            } else if (c <= 10) {
                System.out.println("Cold");
            }
        }
        catch (InputMismatchException ex) {
            System.out.println("Error: " + ex);
        }

        in.close();
    }
}
