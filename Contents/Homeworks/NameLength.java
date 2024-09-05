import java.util.Scanner;
import java.util.InputMismatchException;

class NameLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Name: ");
        try {
            String name = in.next();
            if (name.length() >= 10) {
                System.out.println("Length of " + name + " is greater then 10");
            } else {
                System.out.println("Hello, " + name);
            }
        }
        catch (InputMismatchException ex) {
            System.out.println("Error: " + ex);
        }

        in.close();
    }
}
