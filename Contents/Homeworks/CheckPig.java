import java.util.Scanner;

class CheckPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a height: ");
        double height = scanner.nextDouble();

        System.out.print("Enter a weight: ");
        double weight = scanner.nextDouble();

        double average = (height - 100) * 0.9;
        double pigPoint = (weight - average) * 100 / average;
        if (pigPoint <= 10) {
            System.out.println("You are underweight.");
        } else if (pigPoint <= 20) {
            System.out.println("You are normal.");
        } else {
            System.out.println("You are overweight.");
        }

        scanner.close();
    }
}
