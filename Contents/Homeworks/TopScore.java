import java.util.Scanner;

public class TopScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        int top = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > top) {
                top = scores[i];
            }
        }

        System.out.println("Top score:" + top);

        scanner.close();
    }
}
