import java.util.Scanner;

public class PrintScoresByInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        
        scanner.close();
    }
}
