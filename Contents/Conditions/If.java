import java.util.Scanner;

class If {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("First number: ");
        int num1 = in.nextInt();
        System.out.print("Second number: ");
        int num2 = in.nextInt();

        if (num1 + num2 >= 20) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) + " Greater than 20");
        }

        in.close();
    }
}
