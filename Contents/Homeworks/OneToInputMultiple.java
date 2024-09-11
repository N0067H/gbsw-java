import java.util.Scanner;

class OneToInputMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
