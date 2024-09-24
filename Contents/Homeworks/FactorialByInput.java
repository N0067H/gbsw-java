import java.util.Scanner;

class FactorialByInput {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        System.out.println(number + "! is " + factorial(number));

        scanner.close();
    }
}
