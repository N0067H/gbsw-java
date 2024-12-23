package chapter1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressApp {

    public static void main(String[] args) {
        var list = load();
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

            if (menu == 1) {
                System.out.print("Name: ");
                var name = in.next();
                
                for (var f : list) {
                    if (f.getName().contains(name)) {
                        System.out.println(f.getName() + '\t'
                                + f.getPhone() + '\t'
                                + f.getNick() + '\t'
                                + f.getCode() + '\t'
                                + f.getAge() + '\n');
                    }
                }
            } else if (menu == 2) {
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
            } else if (menu == 3) {
                System.out.print("Name: ");
                var name = in.next();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().equals(name)) {
                        list.remove(i);
                        System.out.println("User removed");
                        break;
                    }
                }
            } else if (menu == 4) {
                save(list);
                System.exit(0);
            } else {
                System.out.println("Wrong menu");
            }
        }

        System.out.println("Program exited");
    }

    private static ArrayList<Friend> load() {
        var list = new ArrayList<Friend>();

        try (var in = new BufferedReader(new FileReader("friends.txt"))) {
            String line;
            while ((line = in.readLine()) != null) {
                var parts = line.split("\t");
                if (parts.length == 5) {
                    var friend = new Friend(parts[0], parts[1], parts[2], parts[3], Integer.parseInt(parts[4]));
                    list.add(friend);
                }
            }
        } catch (IOException e) {
        }
        return list;
    }

    private static void save(ArrayList<Friend> list) {
        try (var out = new BufferedWriter(new FileWriter("friends.txt"))) {
            for (var f : list) {
                out.write(f.getName() + "\t" + f.getPhone() + "\t" + f.getNick() + "\t" + f.getCode() + "\t" + f.getAge() + "\n");
            }
        } catch (IOException e) {
        }
    }
}
