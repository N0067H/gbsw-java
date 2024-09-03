
import java.util.Scanner;

public class InputTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("W >> ");
        double w = scanner.nextDouble();
        System.out.print("H >>");
        double h = scanner.nextDouble();
        
        double triangle = w * h / 2;
        System.out.println(triangle);

        scanner.close();
    }
}
