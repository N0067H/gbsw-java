import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        System.out.println("Total score: " + total);
        
        int average = total / scores.length;
        System.out.println("Average: " + average);

        scanner.close();
    }
}
