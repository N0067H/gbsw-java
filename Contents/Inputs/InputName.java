
import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Name >> ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);

        scanner.close();
    }
}

