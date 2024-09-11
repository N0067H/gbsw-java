import java.util.Scanner;

public class InputLess100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (sum < 100) {
            sum += scanner.nextInt();
            System.out.println(sum);
        }

        scanner.close();
    }
}
