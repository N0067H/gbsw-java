import java.util.Scanner;

public class GivePencils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of pencils: ");
        int pencils = scanner.nextInt();
        System.out.println("Enter the number of students: ");
        int students = scanner.nextInt();

        int pencilsPerStudent = pencils / students;
        int pencilsLeft = pencils % students;
        System.out.println("Pencils per students: " + pencilsPerStudent);
        System.out.println("Pencils left: " + pencilsLeft);

        scanner.close();
    }
}
