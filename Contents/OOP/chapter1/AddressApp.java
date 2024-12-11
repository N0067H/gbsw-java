package chapter1;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressApp {

    public static void main(String[] args) {
        var list = new ArrayList<Friend>();
        var in = new Scanner(System.in);

        int menu = 0;
        while (menu != 4) {
            System.out.println("========== <MENU> ==========");
            System.out.println("* 1. Search User           *");
            System.out.println("* 2. Add User              *");
            System.out.println("* 3. Remove User           *");
            System.out.println("* 4. Program Exit          *");
            System.out.println("============================");
            menu = in.nextInt();

            switch (menu) {
            case 2:
                System.out.print("Name: ");
                var name = in.next();

                System.out.print("Phone: ");
                var phone = in.next();

                System.out.print("Nick: ");
                var nick = in.next();

                System.out.print("Code: ");
                var code = in.next();

                System.out.print("Age: ");
                var age = in.nextInt();

                list.add(new Friend(name, phone, nick, code, age));
                System.out.println("User added");
                
            default:
                System.out.println("Wrong menu");
            }
        }

        System.out.println("Program exited");
    }
}
