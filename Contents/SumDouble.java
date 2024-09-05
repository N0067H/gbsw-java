
import java.util.Scanner;

public class SumDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number>> ");
        double x = scanner.nextDouble();
        System.out.print("Number2 >>");
        double y = scanner.nextDouble();
        
        double sum = x + y;
        System.out.println("Sum is " + sum);

        scanner.close();
    }
}
