import java.util.InputMismatchException;
import java.util.Scanner;

class CheckMultiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Number: ");
        try {
            int number = in.nextInt();
            if (number % 3 == 0) {
                System.out.println("Multiple by 3");
            } else if (number % 2 == 0) {
                System.out.println("Multiple by 2");
            } else {
                System.out.println("Nothing.");
            }
        }
        catch (InputMismatchException ex) {
            System.out.println("Error: " + ex);
        }

        in.close();
    }
}
