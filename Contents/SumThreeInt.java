import java.util.Scanner;

public class SumThreeInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers: ");
        String num = scanner.next();
        int sum = num.charAt(0) - '0' + num.charAt(1) - '0' + num.charAt(2) - '0';
        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
