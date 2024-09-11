import java.util.Scanner;


public class InputPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int sum = 0;
        int count = 0;
        while (num >= 0) {
            sum += num;
            count++;
            num = scanner.nextInt();
        }

        double average = (double) sum / count;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        scanner.close();
    }
}
