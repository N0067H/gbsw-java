
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number1>> ");
        int x = scanner.nextInt();
        System.out.println("Number2>> ");
        int y = scanner.nextInt();
        
        int sum = x + y;
        System.out.println("Sum is " + sum);

        scanner.close();
    }
}

