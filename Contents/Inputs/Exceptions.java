
import java.util.InputMismatchException;
import java.util.Scanner;

class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException e) {
            System.out.println("Only Integer");
        }

        scanner.close();
    }
}
