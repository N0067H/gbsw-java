import java.util.Scanner;

class SumOneToInput {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to " + input + " is " + sum);

        scanner.close();
    }
}
